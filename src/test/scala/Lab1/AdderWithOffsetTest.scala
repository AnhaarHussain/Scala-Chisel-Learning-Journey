package Lab1

import org.scalatest._
import chiseltest._
import chisel3._

class AdderWithOffsetTest extends FreeSpec with ChiselScalatestTester{
    "New AdderWithOffest Test" in {
        test(new AdderWithOffset()) { c =>
        c.io.x.poke(1.S)
        c.io.y.poke(1.U)
        c.clock.step(1)
        }
    }
}