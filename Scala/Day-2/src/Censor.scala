import java.io.File

trait Censor {
	val defaultSubs = Map("Shoot" -> "Pucky", "Darn" -> "Beans")
	
	def censor(xs: List[String]): List[String] = censor(defaultSubs, xs)
	
	def censor(substitutions: Map[String, String], xs: List[String]) = {
	  val subsWithDef = substitutions.withDefault(d => d)
	  xs.map(word => subsWithDef(word)) 
	}
}