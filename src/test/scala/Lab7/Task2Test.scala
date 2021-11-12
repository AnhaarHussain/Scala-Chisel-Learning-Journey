package Lab7

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Task2_ManchesterTest extends FreeSpec with ChiselScalatestTester{
    "Task2_Manchester" in  {
        test (new Task2_Manchester){c=>
        c.io.in.poke(1.U)
        c.io.start.poke(1.B)

        c.clock.step(50)
        }
    }
}