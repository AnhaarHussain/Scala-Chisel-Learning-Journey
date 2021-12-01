package Practice

object FibModule {
  def Fibonacci(n: Int): Int = {
    def Fibo_tail(n: Int, a: Int, b: Int): Int = {
      if (n == 0) a
      else Fibo_tail(n-1, b, a+b)
    }

    Fibo_tail(n, 0, 1)
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  /*private def formatFibo(x: Int) = {
    val msg = "Fibonacci series of %d is %d"
    msg.format(x, Fibonacci(x))
  }
*/
  def main(args: Array[String]): Unit = {
    println(formatResult("fibonacci", 9, Fibonacci))
  }

}
