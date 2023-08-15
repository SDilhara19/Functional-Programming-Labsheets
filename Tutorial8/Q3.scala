object Q3 {
  val toUpper: (String) => String = x => x.toUpperCase()
  val toLower: (String) => String = x => x.toLowerCase()

  val NameFormat: ((String) => String, String) => Unit = (f, x) => {
    val r = f(x)
    println(r)
  }

  def toUppcer(x: String, index: Int): String = {
    val newString = new StringBuilder(x)
    val char = newString(index)
    newString(index) = char.toUpper
    newString.toString()
  }

  def main(args: Array[String]): Unit = {
    NameFormat(toUpper(_, 5), "Sanduni") // Using partial application for toUpper
    println(toUpper("Sanduni", 5)) // Calling toUpper directly
  }




def main(args: Array[String]): Unit = {
    NameFormat(toUpper, "Sanduni")
    toUppcer("Sanduni", 5)
  }
}