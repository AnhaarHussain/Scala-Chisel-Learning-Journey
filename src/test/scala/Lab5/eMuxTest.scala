package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class eMuxTest extends FreeSpec with ChiselScalatestTester {
    "New eMux Test" in { 
    test(new eMux(SInt(3.W))) { c=>
    c.io.in1.poke(3.S)
    c.io.in2.poke(2.S)
    c.io.sel.poke(0.B)
    c.io.out.expect(2.S)
    c.clock.step(1)
        }  
    }
}