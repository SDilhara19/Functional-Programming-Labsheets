object Q2 extends App
{
  def calculateSquare(numbers: List[Int]): List[Int]=
    {
      numbers.map(x => x * x)
    }

  var inputList: List[Int] = List(1,2,3,4,5,6,7,8,9,10)
  var outputList: List[Int] = calculateSquare(inputList)

  println(outputList)

}