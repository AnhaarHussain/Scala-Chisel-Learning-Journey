package practice

import org.scalatest._
import chiseltest._
import chisel3._

class HALFADDERtest extends FreeSpec with ChiselScalatestTester{
    "New HALFADDER Gate Test" in {
        test(new HALFADDER()) { c =>
        c.io.a.poke(0.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(1.U)
        c.io.output2.expect(0.U)
        
        }
    }
}
