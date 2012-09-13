List valueOutOfPlace := method(position,
  at(position) < at(position - 1)
)

List stepItBack := method(position,
  swapIndices(position-1, position)
  if (position > 1, position = position - 1)
  position
)

List moveForward := method(position,
  position + 1
)

List gnomeSort := method(
  position := 1
  while(position < size,
    if(valueOutOfPlace(position),
       position = stepItBack(position),
       position = moveForward(position))
  )
)

l := list(3,1,5,2,13,14,12,15)
expected := list(1,2,3,5,12,13,14,15)

l gnomeSort

if(l == expected,
   "they're the same" println,
   Exception raise("they're not the same expected\n #{expected} but got\n #{l}" interpolate)
)
