// package Lab8

// import org.scalatest._
// import chiseltest._
// import chisel3._
// import chisel3.util._

// class Ex3Test extends FreeSpec with ChiselScalatestTester{
//     "Ex3 Test" in  {
//         test (new Ex3){c=>
//         c.io.addr.poke(0.U)
//         c.io.instr.expect("b100100000000000010010011".U)
        
//         c.clock.step(100)
//         }
//     }
// }