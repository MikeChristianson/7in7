TwoDList := Object clone do (

init := method(
	self yList := List clone
)

dim := method(x, y,
	yList preallocateToSize(y)
	for(i, 0, y-1,
		yList append(List clone preallocateToSize(x))
	)
)

set := method(x, y, value, 
	writeln(x, y, value)
	yList at(y) atPut(x, value)
)

get := method(x, y,
	yList at(y) at(x)
)

)

xy := TwoDList clone
xy dim(2,2)
xy set(0,0,"zero-zero")
xy set(0,1,"zero-one")
xy set(1,0,"one-zero")
xy set(1,1,"one-one")
xy println

file := File clone openForUpdating("xy.ser")
file write(xy serialized)
file close

file = File clone openForReading("xy.ser")
# ...?
