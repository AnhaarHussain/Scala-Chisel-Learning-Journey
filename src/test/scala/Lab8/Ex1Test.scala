package Lab8

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Ex1Test extends FreeSpec with ChiselScalatestTester{
    "Ex1 Test" in  {
        test (new Ex1){c=>
        c.io.enable.poke(1.B)
        c.io.write.poke(1.B)
        c.io.addr.poke(6.U)
        c.io.mask.poke(0.U)
    
        c.io.dataIn.poke(555.U)
        
        //c.io.dataOut.expect(2.U)
        
        c.clock.step(50)
        }
    }
}