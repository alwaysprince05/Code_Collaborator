class Employee:
    language = "py" # This is a class attribute
    salary = 120000000

# lets suppose kisi company me har employee ki language and salary same hai.
harry = Employee()
# This is an object/instance attribute
harry.name = "Harry" # lets suppose hm particular employee ka naam bhi dena chahte hai.
print(harry.name,harry.language,harry.salary)

rohan = Employee()
rohan.name = "Rohan Roro Robinson"
print(rohan.name,rohan.salary,rohan.language) # here salary and language are class attributes ko ki directly class ko hi belong karte hai.

# Here name is instance/object attribute and salary and language are class attributes as they directly belong to the class
