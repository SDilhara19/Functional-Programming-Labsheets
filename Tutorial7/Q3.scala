object Q3 extends App {

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(x => isPrime(x))
  }
    def isPrime(num: Int,int: Int = 2): Boolean = {
      if(num<2) false
      else if(num==2) true
      else if(int*int>num) true
      else if(num%int==0) false
      else isPrime(num,int+1)
    }

  var inputList: List[Int] = List(1,2,3,4,5,6,7,8,9,10,101,150,225,87,17,19,29)
  var outputList: List[Int] = filterPrime(inputList)

  println(outputList)


}

