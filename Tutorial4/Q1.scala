object Main {
  def main(args: Array[String]): Unit = {
    printf("Enter the principal amount:  ")
    var PrincipalAmount = scala.io.StdIn.readInt()
    println("Interest for the given amount: " + CalInterest(PrincipalAmount))
  }

  def CalInterest(P: Int): Double = P match {
    case x if x < 20000 => 0.02 * x
    case x if x < 200000 => 0.04 * x
    case x if x < 2000000 => 0.035 * x
    case x if x >= 2000000 => 0.065 * x

  }
}
