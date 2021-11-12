package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Ex2Test extends FreeSpec with ChiselScalatestTester{
    "Ex2 Test" in  {
        test (new Ex2){c=>
        c.io.rdAddr.poke(2.U)
        c.io.wrAddr.poke(2.U)
        c.io.wrData(0).poke(24.U)
        c.io.mask(0).poke(1.B)
        c.clock.step(1)

        c.io.wr_en.poke(1.B)

        c.io.rdAddr.poke(2.U)
        c.io.wrAddr.poke(2.U)
        c.io.wrData(1).poke(16.U)
        c.io.mask(1).poke(1.B)
        c.clock.step(2)
    
        }
    }
}