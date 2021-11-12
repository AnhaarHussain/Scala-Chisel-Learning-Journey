package practice

import org.scalatest._
import chiseltest._
import chisel3._

class Fulladdertest extends FreeSpec with ChiselScalatestTester{
    "New FULLADDER Gate Test" in {
        test(new fulladder()) { c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(2.U)
        
        }
    }
}