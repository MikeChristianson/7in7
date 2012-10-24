object worksheet {
  println("Hello, surreal world")                 //> Hello, surreal world
  1 + 1                                           //> res0: Int(2) = 2
  (1).+(1)                                        //> res1: Int(2) = 2
	5 + 4 * 3                                 //> res2: Int = 17
	5.+(4.*(3))                               //> res3: Double = 17.0
	(5).+((4).*(3))                           //> res4: Int = 17

	"abc".size                                //> res5: Int = 3
	"abc" + 4                                 //> res6: java.lang.String = abc4
	4 + "abc"                                 //> res7: String = 4abc
	4 + "1.0"                                 //> res8: String = 41.0
	//4 * "abc"
	
	5 < 6                                     //> res9: Boolean(true) = true
	5 <= 6                                    //> res10: Boolean(true) = true
	5 <= 2                                    //> res11: Boolean(false) = false
	5 >= 2                                    //> res12: Boolean(true) = true
	5 != 2                                    //> res13: Boolean(true) = true
	
	val a = 1                                 //> a  : Int = 1
	val b = 2                                 //> b  : Int = 2
	if (b < a) {
		println("true")
	} else {
		println("false")
	}                                         //> false
	
	Nil                                       //> res14: scala.collection.immutable.Nil.type = List()
	
	//if (0) {println("true")}
	//if(Nil) {println("true")}

}