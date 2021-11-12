// package Lab5

// import org.scalatest._
// import chiseltest._
// import chisel3._

// class switch_2cross2Test extends FreeSpec with ChiselScalatestTester {
//     "New Switch_2cross2 Test" in { 
//     test(new switch_2cross2(4.U)) { c=>
//     c.io.in1.poke(4.U)
//     c.io.in2.poke(3.U)
//     c.io.sel.poke(1.B)
//     c.io.out1.expect(3.U)
//     c.io.out2.expect(4.U)
//     c.clock.step(100)
//         }  
//     }
// }