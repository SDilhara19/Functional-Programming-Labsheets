
object MyClass
 {

    def sum(x:Int): Int = x match
    {

        case x if (x<1) => 0

        case _ => (x+sum(x-1))

    }


    def main(args: Array[String]) {

        print("sum = " + sum(5));

    }

}