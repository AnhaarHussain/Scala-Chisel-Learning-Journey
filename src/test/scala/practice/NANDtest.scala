package practice

import org.scalatest._
import chiseltest._
import chisel3._

class NANDtest extends FreeSpec with ChiselScalatestTester{
    "New NOR Gate Test" in {
        test(new NAND()) { c =>
        c.io.a.poke(1.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.output.expect(1.U)
        
        }
    }
}