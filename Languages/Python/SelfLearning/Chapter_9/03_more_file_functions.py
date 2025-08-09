f = open("file.txt")

# lines = f.readlines() # readlines() functions return the list of lines.

# print(lines,type(lines)) # type(lines) -> output -> class list

# f.close() 



# readline() function -> readlines tb tk read karti rhti hai jb tk emptyString = ""(True) n ho jaye
# ye sare lines ko one by one print karta hai.

# lines = f.readlines()
# print(lines,type(lines))

# line1 = f.readline()
# print(line1,type(line1))

# line2 = f.readline()
# print(line2,type(line2))

# line3 = f.readline()
# print(line3,type(line3))

# line4 = f.readline()
# print(line4,type(line4))

# line5 = f.readline()
# print(line5=="") # emptyString = "" (True)


# Using the while loops (lines tb tk print hoti rhengi jb tk ki sari lines na aa jaye)
line = f.readline()
while(line != ""):
    print(line)
    line = f.readline()

f.close()