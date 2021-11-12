package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Masked_RWTest extends FreeSpec with ChiselScalatestTester{
    "Masked_RW Test" in  {
        test (new Masked_RW){c=>
        c.io.enable.poke(1.B)
        c.io.write.poke(1.B)
        c.io.addr.poke(6.U)
        c.io.mask(0).poke(1.B)
        c.io.mask(1).poke(0.B)
        c.io.mask(2).poke(0.B)
        c.io.mask(3).poke(1.B)

        c.io.dataIn(0).poke(2.U)
        c.io.dataIn(1).poke(4.U)
        c.io.dataIn(2).poke(6.U)
        c.io.dataIn(3).poke(2.U)
        
        //c.io.dataOut(0).expect(2.U)
        //c.io.dataOut(1).expect(0.U)
        //c.io.dataOut(2).expect(0.U)
        //c.io.dataOut(3).expect(2.U)


        c.clock.step(50)
        }
    }
}