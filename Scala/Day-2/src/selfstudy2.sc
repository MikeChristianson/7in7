object selfstudy2 extends Censor {
	val source = "this Shoot that Darn other Shoot".split(' ').toList
                                                  //> source  : List[String] = List(this, Shoot, that, Darn, other, Shoot)
	val censored = censor(source)             //> censored  : List[java.lang.String] = List(this, Pucky, that, Beans, other, P
                                                  //| ucky)
	assert(censored == "this Pucky that Beans other Pucky".split(' ').toList)
}