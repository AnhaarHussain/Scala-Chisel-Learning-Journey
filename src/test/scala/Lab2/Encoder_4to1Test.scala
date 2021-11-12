// package Lab2

// import org.scalatest._
// import chiseltest._
// import chisel3._

// class Encoder_4to1Test extends FreeSpec with ChiselScalatestTester {
//     "New Encoder_4to1 Test" in { 
//     test(new Encoder_4to1()) { c=>
//     c.io.in.poke("0110".U)
//     c.io.s1.poke(true.B)
//     c.io.s2.poke(false.B)
//     c.io.s3.poke(true.B)
//     c.io.out.expect(0.U)
    
//     c.clock.step(100)
//         }
//     }
// }  
