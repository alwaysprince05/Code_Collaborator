# in general we don't counter the negative slicing

name = "Harry"
print(name[0:3])

print(name[-4:-1]) # -> arr
print(name[1:4])  # -> arr -> Note: hm negative indexes ko corresponing positive index me bhi convert karenge to bhi same output aayega..

print(name[:4]) # Note -> agar ind_start pe kuchh nhi likha hoga iska mtlb vha 0 likha hua hai # is same as print(name[0:4])
print(name[1:]) # Note -> agar ind_end pe kuchh nhi likha hua iska mtlb length-1 likha hua hai
print(name[1:5]) # Note -> print(name[1:]),print(name[1:5]) both are same.


