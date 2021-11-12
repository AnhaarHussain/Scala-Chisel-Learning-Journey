package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class MuxCaseTest extends FreeSpec with ChiselScalatestTester {
    "New Mux Case Test" in { 
    test(new MuxCase_ex()) { c=>
    c.io.in0.poke(true.B)
    c.io.in1.poke(true.B)
    c.io.in2.poke(false.B)
    c.io.in3.poke(true.B)
    c.io.in4.poke(false.B)
    c.io.in5.poke(true.B)
    c.io.in6.poke(true.B)
    c.io.in7.poke(false.B)
    c.io.sel.poke("b101".U)
    c.io.out.expect(1.B)
    
    c.clock.step(100)
        }
    }
}  