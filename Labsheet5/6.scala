

object obj6 {

 
   def Fibo(n:Int):Int= n match

    {

        case x if x<=0 => 0
        case 1 => 0
        case 2 => 1
        case _ =>Fibo(n-1) + Fibo(n-2)
        

    }


    
    def PrintFibo(n:Int): Unit = 
    {
      if (n<0) return
        else  
        {
            print(Fibo(n) + "  ")
            PrintFibo(n-1)
        }
    }

    def main(args: Array[String]) {
 

        println("Fibonachchi Numbers: ");
       PrintFibo(10)


    }
}

