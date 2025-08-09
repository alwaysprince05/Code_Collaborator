class Animals:
    pass

class Pets(Animals):
    pass

class Dog(Pets):

    @staticmethod
    def bark():
        print("Bho , Bho")


d = Dog()

d.bark()