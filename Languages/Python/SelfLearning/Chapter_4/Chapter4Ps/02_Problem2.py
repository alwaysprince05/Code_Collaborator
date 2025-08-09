marks = []

m1 = int(input("Enter Marks here: ")) 
marks.append(m1)
m2 = int(input("Enter fruit name: "))
marks.append(m2)
m3 = int(input("Enter fruit name: "))
marks.append(m3)
m4 = int(input("Enter fruit name: "))
marks.append(m4)
m5 = int(input("Enter fruit name: "))
marks.append(m5)
m6 = int(input("Enter fruit name: "))
marks.append(m6)

marks.sort() # but ye alphabetically sort karega because of string without converting it into integer
print(marks)

