friends = ["Apple","Oranges",5,345.06,False,"Aakash","Rohan"]

print(friends[0])
friends[0] = "Grapes" # Unlike Strings lists are mutable in python
print(friends[0])
print(friends[1:4]) # -> ['Oranges',5,345.06]
