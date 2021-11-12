package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class ForwardingTest extends FreeSpec with ChiselScalatestTester{
    "Forwarding Test" in  {
        test (new Forwarding){c=>
        c.io.rdAddr.poke(1.U)
        c.io.wrAddr.poke(1.U)
        c.io.wrData.poke(6.U)
        c.io.wr_en.poke(1.B)
        
        //c.io.out.expect(6.U)
        c.clock.step(50)

        }
    }
}