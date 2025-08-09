'''
a = "a very long string with emails"
and iske baad hmne ek program likha emails extract karne ka and ye emails list me aa gye 

emails = []
Let Suppose programme ne time lika 3 seconds chalne me but ye emails khi pr store hokar nhi milenge.
But hm chahte hai ki data hme store hokar mile isliye hm file ka use karte hai..ex-text file, mp4 file(for videos),mp3 for(songs) ye sari files me data stored hota hai.
That is why hm data ko save/persist karane k liye file ka use karte hai.ex-Inside the HardDisk.
'''


# How to read the file
f = open("file.txt") # open() is builtIn function in python used to open the file , by default file "r" mode me hi khulta hai.agar file ko write krna hai to comma lga ke "w" likhana padega.
data = f.read() # read() is used to read the file
print(data)
f.close() # close() is used to close the file. Note -> jb bhi hm files ko kholte hai to it's a duty to close the file because hm computer ko btate hai ki ab ye file hmare programm me nhi khuli hai.
