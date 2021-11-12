package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class Mux1HTest extends FreeSpec with ChiselScalatestTester {
    "New Mux1H 4to1 Test" in { 
    test(new mux_onehot_4to1()) { c=>
    c.io.in0.poke(9.U)
    c.io.in1.poke(18.U)
    c.io.in2.poke(27.U)
    c.io.in3.poke(36.U)
    c.io.sel.poke("b1000".U)
    c.io.out.expect(36.U)
    
    c.clock.step(100)
        }
    }
}  