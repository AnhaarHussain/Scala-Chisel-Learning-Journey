package Lab7

import org.scalatest._
import chiseltest._
import chisel3._

class Ex1_ArbiterTest extends FreeSpec with ChiselScalatestTester {
    "Ex1_Arbiter Test" in { 
    test(new Ex1_Arbiter()) { c=>
    c.io.in(0).valid.poke(1.B)
    c.io.in(1).valid.poke(1.B)
    c.io.in(0).bits.poke(24.U)
    c.io.in(1).bits.poke(24.U)
    c.io.out.ready.poke(1.B)
    //c.io.out.expect(3.U)
    c.clock.step(100)
        }  
    }
}