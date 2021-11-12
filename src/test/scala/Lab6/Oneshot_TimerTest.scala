// package Lab6

// import org.scalatest._
// import chiseltest._
// import chisel3._

// class Oneshot_TimerTest extends FreeSpec with ChiselScalatestTester {
//     "Oneshot Timer Test" in { 
//     test(new Oneshot_Timer()) { c=>
//     c.io.reload.poke(1.B)
//     //c.io.out.expect(3.U)
//     c.clock.step(100)
//         }  
//     }
// }
