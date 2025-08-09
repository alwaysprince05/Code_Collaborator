class Number:
    def __init__(self,n):
        self.n = n

    def __add__(self,num): # methods overloadding , agar hm 2 trah ke operands ko customize karna chahte hai to. usind add() class function
        return self.n + num.n
    
n = Number(1)
m = Number(2)

print(n + m)

