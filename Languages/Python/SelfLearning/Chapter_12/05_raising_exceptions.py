a = int(input("Enter a number: "))
b = int(input("Enter second number: "))

if(b==0):
    raise ZeroDivisionError(" Hey our program is not meant to divide numbers by zero ")
else:
    print(f"The division a/b is {a/b}") # means hm apne program me bhi error raise kr skte hai