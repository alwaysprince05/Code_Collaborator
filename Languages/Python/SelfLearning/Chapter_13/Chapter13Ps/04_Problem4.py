def divisible5(n):
    if(n%5==0):
        return True
    return False

a = [1,2,34234,53,65,45,55,754]

f = list(filter(divisible5,a))
print(f)


