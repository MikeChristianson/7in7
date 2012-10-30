trait Censor {
	val substitutions = Map("Shoot" -> "Pucky", "Darn" -> "Beans").withDefault(d => d)
	
	def censor(xs: List[String]) = xs.map(word => substitutions(word))
}