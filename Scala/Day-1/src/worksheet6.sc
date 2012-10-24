object worksheet6 {
	class Person(val firstName: String) {
		println("Outer constructor")
		def this(firstName: String, lastName: String) {
			this(firstName)
			println("Inner constructor")
		}
		
		def talk = println("Hi")
	}
	
	val bob = new Person("Bob")               //> Outer constructor
                                                  //| bob  : worksheet6.Person = worksheet6$Person@6403b70c
	val bobTate = new Person("Bob", "Tate")   //> Outer constructor
                                                  //| Inner constructor
                                                  //| bobTate  : worksheet6.Person = worksheet6$Person@2fe6a820
  bobTate.firstName                               //> res0: String = Bob
  //bobTate.lastName
}