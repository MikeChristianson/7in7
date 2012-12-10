-module (third).
-export ([f/1]).

f({error, Message}) -> io:fwrite("error: ~s~n", [Message]);
f(success) -> io:fwrite("~s~n", [success]).