package Assignment2

object Ex3 extends App {
  def Func_Op(param: Option[Int]):Unit = {
    println(param)
  }

  Func_Op(Some(3))
  Func_Op(None)

}


