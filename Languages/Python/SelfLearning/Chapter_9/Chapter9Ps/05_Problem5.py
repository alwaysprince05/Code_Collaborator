words = ["Donkey","bad","ganda"]

with open("file.txt", "r") as f:
    content = f.read()

for word in words: # hme jha - jha words mil rha utna # lga de rhe hai uske pr.
    content = content.replace(word,"#"*len(word))

with open("file.txt","w") as f:
    f.write(content)
