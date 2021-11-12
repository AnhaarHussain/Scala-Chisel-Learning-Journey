package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester {
    "Mux_5to1 Test" in { 
    test(new Task1()) { c=>
    c.io.s0.poke(0.B)
    c.io.s1.poke(1.B)
    c.io.s2.poke(0.B)
    c.io.out.expect(16.U)
    
    c.clock.step(100)
        }
    }
}  