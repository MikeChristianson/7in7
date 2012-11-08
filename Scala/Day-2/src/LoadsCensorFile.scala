import java.io.File

trait LoadsCensorFile {

  def loadFile(name: String, enc: String) = {
    val sourceFile = scala.io.Source.fromFile(name, enc)
    val substitutions = sourceFile.getLines.foldLeft(Map[String, String]()) { (map, line) => {
    	val split = line.split("=")
    	map + (split(0) -> split(1))
  	  }
    }
    sourceFile.close
    substitutions
  }
}