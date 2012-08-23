List myAvg := method(
	if(self size == 0, Exception raise("hey it's empty"), self average)
)

lst := list(1,2,3)
lst myAvg println

lst := list()
lst myAvg
