package Assignment2

object Ex2 extends App {

  // Mutable Mapping
  val Role_no = Map("Anhaar" -> 78, "Rija" -> 114)
  //Role_no += ("Nabah" -> 132)     -----> This is immutable
  println(Role_no)

  var Role_no2 = Map("Anhaar" -> 78, "Rija" -> 114)
  Role_no2 += ("Nabah" -> 132)
  println(Role_no2)


  // Mutable Sets
  val num_set1 = Set(9, 18, 27)
  // set1+= (5)               ------> This is immutable
  println(num_set1)

  var num_set2 = Set(36, 45, 54)
  num_set2 += (63)
  println(num_set2)
}


