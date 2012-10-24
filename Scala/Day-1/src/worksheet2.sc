object worksheet2 {
	val range = 0 until 10                    //> range  : scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 
                                                  //| 9)
  range.start                                     //> res0: Int = 0
  range.end                                       //> res1: Int = 10
  range.step                                      //> res2: Int = 1
	
	(0 to 10) by 5                            //> res3: scala.collection.immutable.Range = Range(0, 5, 10)
	(0 to 10) by 6                            //> res4: scala.collection.immutable.Range = Range(0, 6)
	
	(0 to 10 by 5)                            //> res5: scala.collection.immutable.Range = Range(0, 5, 10)
	
	val range2 = (10 until 0) by -1           //> range2  : scala.collection.immutable.Range = Range(10, 9, 8, 7, 6, 5, 4, 3, 
                                                  //| 2, 1)
  val range3 = (10 until 0)                       //> range3  : scala.collection.immutable.Range = Range()
	val range4 = (0 to 10)                    //> range4  : scala.collection.immutable.Range.Inclusive = Range(0, 1, 2, 3, 4, 
                                                  //| 5, 6, 7, 8, 9, 10)
 	'a' to 'e'                                //> res6: scala.collection.immutable.NumericRange.Inclusive[Char] = NumericRange
                                                  //| (a, b, c, d, e)
}