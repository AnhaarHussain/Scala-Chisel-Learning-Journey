package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class RegisterFileTest extends FreeSpec with ChiselScalatestTester {
    "Register File Test" in { 
    test(new RegisterFile()) { c=>
    c.io.raddr1.poke(2.U)
    c.io.raddr2.poke(3.U)
    c.io.waddr.poke(2.U)
    c.io.wdata.poke(16.U)
    c.io.wen.poke(1.B)
    //c.io.rdata1.expect(16.U)
    //c.io.rdata2.expect(16.U)
    c.clock.step(100)
        }  
    }
}