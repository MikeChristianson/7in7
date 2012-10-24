object worksheet5 {
	val c = new Compass                       //> Initial bearing: north
                                                  //| c  : Compass = Compass@5280fbef
 	
 	c.turnRight                               //> Turning right. Now bearing east.
	c.turnRight                               //> Turning right. Now bearing south.
	
	c.turnLeft                                //> Turning left. Now bearing east.
	c.turnLeft                                //> Turning left. Now bearing north.
	c.turnLeft                                //> Turning left. Now bearing west.
}