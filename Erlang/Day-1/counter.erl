-module (counter).
-export ([count_char/1]).
-export ([count_word/1]).

count_char(String) -> count_char(String, 0).
count_char([Head | Tail], Accumulator) -> count_char(Tail, Accumulator + 1);
count_char([], Accumulator) -> Accumulator.

count_word(String) -> count_word(String, 0, "NotInWord").
count_word([32 | Tail], Accumulator, _) -> count_word(Tail, Accumulator, "NotInWord");
count_word([Head | Tail], Accumulator, "NotInWord") -> count_word(Tail, Accumulator + 1, "InWord");
count_word([Head | Tail], Accumulator, "InWord") -> count_word(Tail, Accumulator, "InWord");
count_word([], Accumulator, _) -> Accumulator.
