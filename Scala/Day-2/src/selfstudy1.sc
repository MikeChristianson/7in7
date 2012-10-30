object selfstudy1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def totalSize(list: List[String]) = list.foldLeft(0)((sum, string) => sum + string.length)
                                                  //> totalSize: (list: List[String])Int
  val name = List("Mike", "Christianson")         //> name  : List[java.lang.String] = List(Mike, Christianson)
  assert(totalSize(name) == 16)
  
  def totalSize2(list: List[String]) = (0 /: list) {(sum, string) => sum + string.length}
                                                  //> totalSize2: (list: List[String])Int
  assert(totalSize2(name) == 16)
}