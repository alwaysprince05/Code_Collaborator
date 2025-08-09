class Employee:
    a = 1

    @classmethod # using @classmethod decorator and instead of using self we use cls to ye directly hme class attribute show karega.Ye instance attribute e.a = 45 show nhi karega.
    def show(cls):
        print(f"The class attribute of a is {cls.a}")

e = Employee()
e.a = 45


e.show()