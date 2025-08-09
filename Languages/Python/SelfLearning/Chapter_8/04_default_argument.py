def goodDay(name,ending="Thank you"): 
    print("Good Day,"+name)
    print(ending)

goodDay("Harry","Thanks") # agar default value de diya then is case me thanks use krna hai.
'''
Output -> Good Day, Harry
          Thanks
'''
goodDay("Rohan") # agar default value nhi diya hai then is case me ending="Thank you" ka use krna hai.
'''
Output -> Good Day, Rohan
          Thank you
'''
