import java.nio.charset.Charset

object selfstudy2 extends Censor {
	val source = "this Shoot that Darn other Shoot".split(' ').toList
                                                  
	val censored = censor(source)             
	assert(censored == "this Pucky that Beans other Pucky".split(' ').toList)
}
