
object MyClass {

    def GCD(x:Int, y:Int): Int = y match

    {

        case 0 => x

	case a if a>x => GCD(a,x)

        case _ => GCD(y, x%y)

    }


    def prime(p:Int, n:Int=2): Boolean = n match

    {

        case x if (x==p) => true

        case x if (GCD(p, x)>1) => false

        case x => prime(p, x+1)

    }

    
def primeSeq(n:Int):Unit=
    {

        if (n<=1) return

        else
  
        {

            if (prime(n) == true) print(n + "  ")

            primeSeq(n-1)

        }

    }


    def main(args: Array[String]) 
    {

        
println("Prime Numbers below 10: ");

        primeSeq(10)

    }

}