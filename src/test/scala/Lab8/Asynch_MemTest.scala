package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Asynch_MemTest extends FreeSpec with ChiselScalatestTester{
    "Asynch_Mem Test" in  {
        test (new Asynch_Mem){c=>
        c.io.data_in(0).poke(5.U)
        c.io.data_in(1).poke(8.U)
        c.io.data_in(2).poke(6.U)
        c.io.data_in(3).poke(2.U)
        c.io.data_selector.poke("b01".U)
        c.io.addr.poke("b00010".U)
        //c.io.data_out.expect(.U)


        c.clock.step(50)
        }
    }
}