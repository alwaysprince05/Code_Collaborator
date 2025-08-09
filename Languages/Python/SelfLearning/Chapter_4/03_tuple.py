a = ()
print(type(a)) # tuple for the empty element in python

b = (1,)
print(type(b)) #tuple for the single element in python

# but usually we are dealing with the multi-element in python
c = (1,45,342,3232,)
print(type(c))

# tuple also allow the multiple data type inside it
d = (1,45,342,3232,False,0.32,"Rohan")
print(d)
print(type(d))

# Note : but hm existing tuple ko change nhi kr skte hai because tuple are immutable in python
