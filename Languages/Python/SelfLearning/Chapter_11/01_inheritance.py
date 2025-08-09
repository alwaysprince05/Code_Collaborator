class Employee: # Base/Parent class
    company = "ITC"
    def show(self):
        print(f"The name of the employee is {self.name} and the salary is {self.salary}")


# class Programmer:
#     company = "ITC Infotech"
#     def show(self):
#         print(f"The name is {self.name} and the salary is {self.salary}")

#     def showLanguage(self):
#         print(f"The name is {self.name} and he is good with {self.language} language")    


# Instead of doing this we use:
class Programmer(Employee): # Now ab hm shirf Employee me change karenge and baki sari jgah ye update ho jayega.. # Inherited class
    company = "ITC Infotech"
    def showLanguage(self):
        print(f"The name is {self.name} and he is good with {self.language} language")


a = Employee()
b = Programmer()
print(a.company,b.company)


