import express from "express";
import http from "http";
import { Server } from "socket.io";
import path from "path";
import axios from "axios";
import rateLimit from 'express-rate-limit';
import cors from 'cors';

const app = express();
const server = http.createServer(app);

// Configure rate limiter
const limiter = rateLimit({
  windowMs: 15 * 60 * 1000, // 15 minutes
  max: 100 // limit each IP to 100 requests per windowMs
});

// Apply rate limiter to all routes
app.use(limiter);

// Enable CORS
app.use(cors());

// Socket.IO setup with enhanced CORS
const io = new Server(server, {
  cors: {
    origin: ["http://localhost:5173", "http://localhost:5174"],
    methods: ["GET", "POST"],
    credentials: true
  },
  pingTimeout: 60000,
  pingInterval: 25000
});

// Health check endpoint
app.get("/health", (req, res) => {
  res.status(200).json({ 
    status: "healthy",
    uptime: process.uptime(),
    timestamp: new Date()
  });
});

// Room and user management
const rooms = new Map();

// Language configurations
const LANGUAGE_MAPPINGS = {
  javascript: { language: "javascript", version: "18.15.0" },
  python: { language: "python", version: "3.10.0" },
  java: { language: "java", version: "15.0.2" },
  cpp: { language: "cpp", version: "10.2.0" },
  typescript: { language: "typescript", version: "5.0.0" },
  ruby: { language: "ruby", version: "3.0.0" }
};

// Room activity tracking
const roomActivity = new Map();

// Socket connection handling
io.on("connection", (socket) => {
  console.log("User Connected:", socket.id);

  let currentRoom = null;
  let currentUser = null;
  let lastExecutionTime = 0;

  // Join room handler
  socket.on("join", ({ roomId, userName }) => {
    try {
      // Leave current room if exists
      if (currentRoom) {
        handleLeaveRoom();
      }

      currentRoom = roomId;
      currentUser = userName;

      socket.join(roomId);

      if (!rooms.has(roomId)) {
        rooms.set(roomId, new Set());
        roomActivity.set(roomId, {
          created: new Date(),
          lastActivity: new Date(),
          userCount: 0
        });
      }

      rooms.get(roomId).add(userName);
      roomActivity.get(roomId).userCount = rooms.get(roomId).size;
      roomActivity.get(roomId).lastActivity = new Date();

      // Emit room info
      io.to(roomId).emit("roomInfo", {
        users: Array.from(rooms.get(currentRoom)),
        activity: roomActivity.get(roomId)
      });

      // Notify others
      socket.to(roomId).emit("userNotification", {
        type: "join",
        user: userName,
        timestamp: new Date()
      });
    } catch (error) {
      socket.emit("error", { message: "Failed to join room", details: error.message });
    }
  });

  // Code change handler with debouncing
  let codeChangeTimeout;
  socket.on("codeChange", ({ roomId, code }) => {
    if (codeChangeTimeout) clearTimeout(codeChangeTimeout);
    
    codeChangeTimeout = setTimeout(() => {
      socket.to(roomId).emit("codeUpdate", code);
      updateRoomActivity(roomId);
    }, 100);
  });

  // Leave room handler
  function handleLeaveRoom() {
    if (currentRoom && currentUser) {
      const room = rooms.get(currentRoom);
      if (room) {
        room.delete(currentUser);
        
        if (room.size === 0) {
          rooms.delete(currentRoom);
          roomActivity.delete(currentRoom);
        } else {
          roomActivity.get(currentRoom).userCount = room.size;
          io.to(currentRoom).emit("roomInfo", {
            users: Array.from(room),
            activity: roomActivity.get(currentRoom)
          });

          socket.to(currentRoom).emit("userNotification", {
            type: "leave",
            user: currentUser,
            timestamp: new Date()
          });
        }
      }

      socket.leave(currentRoom);
    }
  }

  socket.on("leaveRoom", handleLeaveRoom);

  // Typing indicator with debouncing
  let typingTimeout;
  socket.on("typing", ({ roomId, userName }) => {
    if (typingTimeout) clearTimeout(typingTimeout);
    
    socket.to(roomId).emit("userTyping", userName);
    
    typingTimeout = setTimeout(() => {
      socket.to(roomId).emit("userStoppedTyping", userName);
    }, 1000);
  });

  // Language change handler
  socket.on("languageChange", ({ roomId, language }) => {
    updateRoomActivity(roomId);
    io.to(roomId).emit("languageUpdate", language);
  });

  // Code compilation handler
  socket.on("compileCode", async ({ code, roomId, language }) => {
    try {
      if (!rooms.has(roomId)) {
        throw new Error("Room not found");
      }

      // Rate limiting
      const now = Date.now();
      if (now - lastExecutionTime < 1000) {
        throw new Error("Please wait at least 1 second between executions");
      }
      lastExecutionTime = now;

      const langConfig = LANGUAGE_MAPPINGS[language];
      if (!langConfig) {
        throw new Error(`Unsupported language: ${language}`);
      }

      updateRoomActivity(roomId);

      const response = await axios.post(
        "https://emkc.org/api/v2/piston/execute",
        {
          language: langConfig.language,
          version: langConfig.version,
          files: [{ content: code }],
        },
        { timeout: 10000 }
      );

      io.to(roomId).emit("codeResponse", {
        ...response.data,
        timestamp: new Date(),
        executedBy: currentUser
      });
    } catch (error) {
      const errorMessage = error.response?.data?.message || error.message || "Execution failed";
      io.to(roomId).emit("codeResponse", { 
        run: { 
          output: `Error: ${errorMessage}`,
          code: error.response?.status || 500
        },
        timestamp: new Date(),
        executedBy: currentUser
      });
    }
  });

  // Disconnect handler
  socket.on("disconnect", () => {
    handleLeaveRoom();
    console.log("User Disconnected:", socket.id);
  });

  // Helper function to update room activity
  function updateRoomActivity(roomId) {
    if (roomActivity.has(roomId)) {
      roomActivity.get(roomId).lastActivity = new Date();
    }
  }
});

// Clean up inactive rooms periodically
setInterval(() => {
  const now = new Date();
  for (const [roomId, activity] of roomActivity.entries()) {
    const inactiveTime = now - activity.lastActivity;
    if (inactiveTime > 24 * 60 * 60 * 1000) { // 24 hours
      rooms.delete(roomId);
      roomActivity.delete(roomId);
    }
  }
}, 60 * 60 * 1000); // Check every hour

// Static file serving
const __dirname = path.resolve();
app.use(express.static(path.join(__dirname, "/frontend/dist")));

app.get("*", (req, res) => {
  res.sendFile(path.join(__dirname, "frontend", "dist", "index.html"));
});

const port = process.env.PORT || 3001;
server.listen(port, () => {
  console.log(`Server is running on port ${port}`);
  console.log(`Server time: ${new Date().toISOString()}`);
}); 