object Q2 {
  def main(args: Array[String]): Unit = {
    val inputLine = scala.io.StdIn.readLine()
    val WordList = inputLine.split(" ").map(_.toString).toList
    println("Letter occurrences count: " +  countLetterOccurrences(WordList))
  }

  def countLetterOccurrences(inputList: List[String]): Int = inputList.map(x => (x.length)).reduce((x, y)=> x+y)

}
