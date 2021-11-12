package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "Task1 Test" in  {
        test (new Task1){c=>
        c.io.writeaddr.poke(4.U)
        c.io.readaddr.poke(2.U)
        c.io.write_en.poke(1.B)
        c.io.requestor(0).valid.poke(1.B)
        c.io.requestor(1).valid.poke(1.B)
        c.io.requestor(2).valid.poke(1.B)
        c.io.requestor(3).valid.poke(1.B)

        c.io.requestor(0).bits.poke(16.U)
        c.io.requestor(1).bits.poke(16.U)
        c.io.requestor(2).bits.poke(16.U)
        c.io.requestor(3).bits.poke(16.U)

        c.io.memory_out.ready.poke(1.B)

        c.clock.step(100)
        }
    }
}