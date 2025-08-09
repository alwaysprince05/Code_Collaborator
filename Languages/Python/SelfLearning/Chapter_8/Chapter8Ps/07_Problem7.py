def rem(l,word):
    n = []
    for item in l:
        if not(item==word):
            n.append(item.strip(word)) # strip function starting/end se kisi ek given word ko nikal deta hai 
    return n        
    
l = ["Harry","Rohan","Subham","an"] 

print(rem(l,"an"))
