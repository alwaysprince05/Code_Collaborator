# fro because from is the reserved keyword in python:
from random import randint

class Train:
    def __init__(slf,trainNo): # instead of self we can use any name here is slf. No effect on output -> it is same as previous once.
        slf.trainNo = trainNo

    def book(harry,fro,to):
        print(f"Ticket is booked in train no: {harry.trainNo} from {fro} to {to}") # but self ka use karne ke programme ki readbility bni rhti hai.

    def getStatus(self):
        print(f"Train no: {self.trainNo} is running on time")

    def getFare(self,fro,to):
        print(f"Ticket fare in train no: {self.trainNo} from {fro} to {to} is {randint(222,5555)}")     


t = Train(12399)
t.book("Rampur","Delhi")
t.getStatus()
t.getFare("Rampur","Delhi")
