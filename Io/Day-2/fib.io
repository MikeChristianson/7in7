Number fib := method(
	if(self == 0, return 0)
	if(self <= 2, return 1)
	(self-1) fib + (self-2) fib
	# my first attempt failed because I was doing 
        # (self-1 fib) + (self-2 fib)
)

Number fibL := method(
	
)
