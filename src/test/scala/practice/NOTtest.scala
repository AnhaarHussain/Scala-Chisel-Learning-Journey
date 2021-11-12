package practice

import org.scalatest._
import chiseltest._
import chisel3._

class NOTtest extends FreeSpec with ChiselScalatestTester{
    "New NOT Gate Test" in {
        test(new NOT()) { c =>
        c.io.a.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        
        }
    }
}