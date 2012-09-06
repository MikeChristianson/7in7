OperatorTable addAssignOperator(":", "atPutIt")

Builder := Object clone

Builder i := 0

Builder forward := method(
  i repeat(write("\t"))
  write("<", call message name)
  i = i + 1
  call message arguments foreach(
	arg, 
	content := self doMessage(arg); 
	if(content type == "Sequence", i repeat(write("\t")); writeln(content))
	if(content type == "Map",
		content foreach(attribute, value, 
			write(" #{attribute}=\"#{value}\"" interpolate)
		)
	)
  )
  writeln(">")
  i = i - 1
  i repeat(write("\t"))
  writeln("</", call message name, ">")
)

Map atPutIt := method(
  self atPut(
    call evalArgAt(0) asMutable removePrefix("\"") removeSuffix("\""),
    call evalArgAt(1)
  )
)

Builder curlyBrackets := method(
  map := Map clone
  call message arguments foreach(arg,
    map doMessage(arg)
  )
  map
)

doFile("builderattr-input.io")
