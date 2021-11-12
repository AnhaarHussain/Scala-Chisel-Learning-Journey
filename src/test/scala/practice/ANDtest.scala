package practice

import org.scalatest._
import chiseltest._
import chisel3._

class ANDtest extends FreeSpec with ChiselScalatestTester{
    "New AND Gate Test" in {
        test(new AND()) { c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.output.expect(0.U)
        
        }
    }
}