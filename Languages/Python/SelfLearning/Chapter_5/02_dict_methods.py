marks = {
    "Harry" : 100,
    "Subham" : 56,
    "Rohan" : 23,
    0 : "Harry"
}
 
print(marks.items()) # return list of tuples.
print(marks.keys()) # return the list containing dictionary's keys.
print(marks.values()) # return the list containing dictionary's values.
marks.update({"Harry":99,"Renuka":100}) # and jo list me key-value pair nhi hai vo bhi update ho jayenge nye wale ko dalne pr
print(marks) # Now the marks of Harry is 99 in the list because list are mutable in python.


print(marks.get("Shivika")) # Output -> None 

print(marks.get("Harry2")) # Prints None
print(marks["Harry2"]) # Returns an error 