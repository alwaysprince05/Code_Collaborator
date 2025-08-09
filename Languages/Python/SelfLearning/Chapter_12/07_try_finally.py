def main():
    try:
       a = int(input("Hey,Enter a number: "))
       print(a)
       return

    except Exception as e:
      print(e)
      return

    finally:
       print("Hey I am inside of finally") # even if the function is returns finally ka code chalega hi chalega

main()       