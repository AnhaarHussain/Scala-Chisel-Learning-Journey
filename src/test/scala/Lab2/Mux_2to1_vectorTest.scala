package Lab2

import org.scalatest._
import chiseltest._
import chisel3._

class Mux_2to1_vectorTest extends FreeSpec with ChiselScalatestTester {
    "New Mux_2to1_vector Test" in { 
    test(new Mux_2to1_vector()) { c=>
    c.io.in_A.poke(4.U)
    c.io.in_B.poke(2.U)
    c.io.select.poke(true.B)

    c.clock.step(100)
        }
    }
}  