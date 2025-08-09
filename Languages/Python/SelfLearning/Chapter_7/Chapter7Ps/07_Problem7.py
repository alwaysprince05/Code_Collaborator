'''
For n = 3
   *
  * *
 * * *   
'''

n = int(input("Enter a number: "))
for i in range(1,n+1):
    print(" "* (n-i),end="")
    print("*"* (2*i-1),end="") # 2*i-1 is the series of the odd numbers
    print("") # here it is used for the new line
