package Practice

object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -n
    else n

  /*private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }*/

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

    /*private def formatFact(a: Int) = {
      val msg = "The factorial of %d is %d"
      msg.format(a, factorial(a))
    }*/

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

    def main(args: Array[String]): Unit = {
      println(formatResult("Abs", -42, abs))
      println(formatResult("Factorial", 5, factorial))
    }
}



