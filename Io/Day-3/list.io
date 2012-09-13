squareBrackets := method(
	call message arguments mapInPlace(value, doMessage(value))
)

[] println
[1] println

[1,2,3] println
sum := [1,2,3] sum
if(sum == 6, 
   "Sum is #{sum} as expected" interpolate println,
   Exception raise("summing the list did not work as expected")
)

list := [1,"a",nil]
list println
list type println
