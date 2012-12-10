-module (rec_count).
-export ([count/1]).

count(N) -> count(N, 0).
count(N, N) -> N;
count(N, A) -> count(N, A + 1).