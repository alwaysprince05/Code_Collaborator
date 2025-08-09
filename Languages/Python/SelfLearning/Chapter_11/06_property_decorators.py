class Employee: # encapsulation -> bez hmne bhut sare kaam karne wake component ko paricular unit me pack kr diya hai.
    a = 1

    @classmethod
    def show(cls):
        print(f"The attribute of a is {cls.a}")

    @property
    def name(self):
        return f"{self.fname} {self.lname}"
    
    @name.setter
    def name (self,value): # now ab hm 2 diff - diff instance attribute set kr rhe hai. abhi name ka instance attribute nhi hai.
        self.fname = value.split(" ")[0] # 0idx wale name ko first name 
        self.lname = value.split(" ")[1] # 1idx wale name ko last name set kiya hai.

e = Employee()
e.a = 45


e.name = "Harry Khan"
print(e.name) # abstraction -> implementation detail ko user se chhupa diya gya hai.

e.show()
