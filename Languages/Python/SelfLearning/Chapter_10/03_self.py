class Employee:
    language = "Python" # This is a class attribute
    salary = 12000000

    def getInfo(self): # hm koi bhi methods bnaye hme ek self dena pdta hai chahe hm use use kre ya na kre.
        print(f"The language is {self.language}. The salary is {self.salary}")

    @staticmethod # means greet() ek static method hai and ab isko object ki jarurat nhi hai.
    def greet():
        print("Good morning")

harry = Employee()
harry.language = "JavaScript" # This is an instance attribute
harry.getInfo() # Output -> The language is JavaScript. The salary is 12000000
# Employee.getInfo(harry)
harry.greet()
