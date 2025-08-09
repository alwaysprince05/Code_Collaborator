class Employee:
    language = "py" # This is a class attribute
    salary = 120000000

harry = Employee()
harry.language = "JavaScript" # This is an object/instance attribute
print(harry.language,harry.salary)

# Instance attributes, take preference over class attributes during assignment & retrieval
# hm set ya get karne ki bhi kosis karenge fir bhi hme instance attributes hi milenge.
