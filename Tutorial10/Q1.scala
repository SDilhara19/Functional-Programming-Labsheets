object Main {
  def main(args: Array[String]): Unit = {
    val inputLine = scala.io.StdIn.readLine()
    val celsiusList = inputLine.split(" ").map(_.toDouble).toList
    println("Average Fahrenheit: " + calculateAverage(celsiusList))
  }

  def calculateAverage(inputList: List[Double]): Double = {
    val fahrenheitList = inputList.map(x => (x * 9 / 5) + 32)

    val sumFahrenheit = fahrenheitList.reduce((x, y) => x + y)

    val avgFahrenheit = sumFahrenheit / fahrenheitList.length

    avgFahrenheit
  }
}
