import random
'''
1 for snake
-1 for water
0 for gun
'''

computer = random.choice([-1,0,1]) # random.choice method is used to generate the random number in python from our choice..
youstr = input("Enter your choice: ")
youDict = {"s":1,"w":-1,"g":0}
you = youDict[youstr]
reverseDict = {1:"Snake",-1:"Water",0:"Gun"} # ye 1 ko Snake , -1 ko Water and 0 ko Gun bnata hai.

you = youDict[youstr]
# By now we have 2 numbers (variables), you and computer 

print(f"You chose {reverseDict[you]}\n Computer choose {reverseDict[computer]}")

if(computer == you):
    print("It's a draw")

else:
    '''
    if(computer == -1 and you == 1): (computer-you) = -2
       print("You Win!")

    elif(computer == -1 and you == 0): (computer-you) = -1
       print("You Lose!")    

    elif(computer == 1 and you == -1): (computer-you) = 2
       print("You Lose!")

    elif(computer == 1 and you == 0): (computer-you) = 1
       print("You Win!")     

    elif(computer == 0 and you == -1): (computer-you) = 1
       print("You Win!")

    elif(computer == 0 and you == 1): (computer-you) = -1
      print("You Lose!")       

    '''   
# The below logic is written on the basis of (computer-you)     
 # logic comes from the above pattern
    if((computer-you)==-1 or (computer-you)==2):
        print("You Lose!")
    else:
        print("You Win!")      
