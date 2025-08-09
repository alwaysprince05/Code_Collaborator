class Vector:
    def __init__(self,list):
        self.list = list

    def __str__(self):
        return len(self.list)
    
# Test to impelementation
v1 = Vector([1,2,3])
print(len(v1))
