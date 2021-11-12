package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class Ex2Test extends FreeSpec with ChiselScalatestTester {
    "Mux Lookup Ex2 Test" in { 
    test(new Ex2()) { c=>
    c.io.in0.poke(true.B)
    c.io.in1.poke(true.B)
    c.io.in2.poke(false.B)
    c.io.in3.poke(true.B)
    c.io.in4.poke(false.B)
    c.io.in5.poke(true.B)
    c.io.in6.poke(true.B)
    c.io.in7.poke(false.B)
    c.io.sel.poke("b100".U)
    c.io.out.expect(0.B)
    
    c.clock.step(100)
        }
    }
}  
