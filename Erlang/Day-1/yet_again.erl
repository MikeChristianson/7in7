-module (yet_again).
-export ([another_factorial/1]).
-export ([another_fib/1]).

another_factorial(N) -> another_factorial(N, 1).
another_factorial(1, Accumulator) -> Accumulator;
another_factorial(N, Accumulator) -> another_factorial(N - 1, Accumulator * N).

another_fib(0) -> 1;
another_fib(1) -> 1;
another_fib(N) -> another_fib(N - 1) + another_fib(N - 2).