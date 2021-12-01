package Assignment2

object Ex4 extends App {

  val List_1 = List(9, 18, 27, 36, 45)

  println("Length of the list is ", List_1.length)

  println("Head of the list is ", List_1.head)

  println("Tail of the list is ", List_1.tail)

  println("Add 2 in each number in the list ", List_1.map(_ + 2).mkString(" "))

  println("Numbers greater than 9 are ", List_1.count(_ > 9))

}
