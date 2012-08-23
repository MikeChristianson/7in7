listA := list(1,1)
listB := list(2,2)
listC := list(3,3)
mylist := list(listA, listB, listC)

total := 0
mylist foreach(v, 
	total = total + v sum
)
total println

mylist flatten sum println
