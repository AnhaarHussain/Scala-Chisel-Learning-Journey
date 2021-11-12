package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class Ex1Test extends FreeSpec with ChiselScalatestTester{
    "Mux_2to1_scalar Test" in {
        test(new Ex1()) { c =>
        c.io.in_A.poke(1.B)
        c.io.in_B.poke(0.B)
        c.io.select.poke(1.B)
        c.clock.step(100)
    
        
        }
    }
}