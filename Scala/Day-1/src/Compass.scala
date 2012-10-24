class Compass {
	val directions = List("north", "east", "south", "west")
	var bearing = 0
	printf("Initial bearing: %s\n", direction)
	
	def direction = directions(bearing)
	
	def inform(turnDirection: String) =
	  printf("Turning %s. Now bearing %s.\n", turnDirection, direction)
	  
	def turnRight() {
	  bearing = (bearing + 1) % directions.size
	  inform("right")
	}
	
	def turnLeft() {
	  bearing = (bearing + (directions.size - 1)) % directions.size
	  inform("left")
	}
}