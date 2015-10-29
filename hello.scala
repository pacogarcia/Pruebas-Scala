// basic language tests
object Hi {
 
  def main(args: Array[String]) = {
    println("Hola mundo!!!")
    /*
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
    */
    args.foreach(arg => println(arg))
    // partial application
    args.foreach(println)
  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  def max(x:Int, y:Int): Int = {
    if (x > y) x else y
  }
  
  // simplified : no brackets

  def max2(x: Int, y: Int) = if (x > y) x else y
  
  // no results (side effects only)

  def greet() = println("Hello, world!")

}
