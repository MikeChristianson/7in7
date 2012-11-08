object selfstudy3 extends Censor with LoadsCensorFile {
	val source = "this Shoot that Darn other Shoot".split(' ').toList
                                                  	
	val substitutions = loadFile("/Users/mike/git/7in7/Scala/Day-2/substitutions.txt", "UTF-8")
                                                    
	val censored = censor(substitutions, source)

	assert(censored == "this Space that Plant other Space".split(' ').toList)
}
