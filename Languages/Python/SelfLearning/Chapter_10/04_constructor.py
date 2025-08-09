class Employee:
    language = "Python" # This is a class attribute
    salary = 12000000

    def __init__(self): # hmne __init__ ko call bhi nhi kiya hai but I am creating an object output me aa rha hai.   # __init__ is a dunder method which is automatically called.
        self.name = name
        self.salary = salary
        self.language = language
        print("I am creating an object")

    def getInfo(self): 
        print(f"The language is {self.language}. The salary is {self.salary}")

    @staticmethod 
    def greet():
        print("Good morning")


harry = Employee("Harry",1300000,"JavaScript")
# harry.name = "Harry" # insted of giving this we are creating a function
print(harry.name,harry.salary,harry.language)

# rohan = Employee # dunder method which is automatically called. Output -> I am creating an object

'''
Output -> 
I am creating an object
Harry 1300000 JavaScript
'''
