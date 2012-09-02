Builder := Object clone do (

init := method(
  self i := 0
)

forward := method(
  i repeat(write("\t"))
  writeln("<", call message name, ">")
  i = i + 1
  call message arguments foreach(
	arg, 
	content := self doMessage(arg); 
	if(content type == "Sequence", i repeat(write("\t")); writeln(content))
  )
  i = i - 1
  i repeat(write("\t"))
  writeln("</", call message name, ">"))
)

builder := Builder clone
builder  ul(
	li("Io"), 
	li("Lua"), 
	li("JavaScript"))