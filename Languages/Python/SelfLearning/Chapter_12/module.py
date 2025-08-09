def myFunc():
    print("Hello World!")

if __name__ == "__main__": # using this bez agar hm kisi dusari file me module.py file ko import krna chahte hai to hm ye nhi chahenge ki below wala bhi code chale, isliye ye use krate hai.
   # if this code is directly executed by running the file its present in
   print("We are directly running this code") 
   myFunc()    
   print(__name__) # same file me jha hmne code likha hai vha pr __main__ output hoga.