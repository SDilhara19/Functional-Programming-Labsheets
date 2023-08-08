object Q3 extends App {

    def filterPrime(l:List[Int]):List[AnyVal] = {
      var newl:List[AnyVal] = l.filter( (x:Int) => prime(x)==true)
      return newl
    }
    def prime(num: Int,int: Int = 2): Boolean = {
      if(num<2) {
        return false
      }
      else if(num==2) {
        return true
      }
      else if(int*int>num) {
        return true
      }
      else if(num%int==0) {
        return false
      }
      else {
        return prime(num,int+1)
      }
    }
    println(filterPrime(List(1,2,3,4,5,6,7,8,9,10,101,150,225,87,17,19,29)))

}