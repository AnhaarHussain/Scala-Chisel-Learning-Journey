package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class Ex2Test extends FreeSpec with ChiselScalatestTester {
    "eMux2 Test" in { 
    test(new Ex2(2.U)) { c=>
    c.io.in1.poke(3.U)
    c.io.in2.poke(2.U)
    c.io.sel.poke(1.B)
    c.io.out.expect(3.U)
    c.clock.step(1)
        }  
    }
}