d = {} # Empty Dictionary

marks = {
    "Harry" : 100,
    "Subham" : 56,
    "Rohan" : 23
}

print(marks,type(marks)) # Dictionary is the list of key-value pairs

print(marks["Harry"]) # 100

# Note -> ye kaam hm list of list ke andar bhi kr skte hai but dictionary me O(1) time complexcity me ho jata hai
# marks = [["Harry",100],] list of list is allowed in python but ye nhi kr skte hai because harry ka direct name leke uski value print nhi kr skte hai and agar complex logic likhenge to ye computanionally expensive hoga.


