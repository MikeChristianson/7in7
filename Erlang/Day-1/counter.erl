-module (counter).
-export ([count_char/1]).

count_char(String) -> count_char(String, 0).
count_char([Head | Tail], Accumulator) -> count_char(Tail, Accumulator + 1);
count_char([], Accumulator) -> Accumulator.