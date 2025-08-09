try:
    a = int(input("Hey,Enter a number: "))
    print(a)

except Exception as e:
    print(e)

else: # when try was successful then ye else ke code me jayega
    print("I am inside else")    
