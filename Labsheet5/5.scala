

object obj5 {

 
   def isEven(n:Int):Boolean= n match

    {

        case 0 => true

        case _ => isOdd(n-1)

    }

    def isOdd(n:Int):Boolean = !(isEven(n))
    
    def PrintEven(n:Int): Unit = 
    {
      if (n<0) return
        else  
        {
            if (isEven(n) == true) 
            println(n)
            PrintEven(n-1)
        }
    }

    def main(args: Array[String]) {
 

        println("Even Number: ");
        PrintEven(10);


    }
}

