object Main {
  def main(args: Array[String]): Unit = {
    printf("Enter an Integer: ")
    var num = scala.io.StdIn.readInt()
    println(PatternMatching(num))
  }

  def PatternMatching(num: Int): String = num match
  {
    case x if x<=0 => "The given number is Negative/Zero"
    case x if x%2==0 =>"The given number is Even"
    case x if x%2==1 =>"The given number is Odd"
  }
}