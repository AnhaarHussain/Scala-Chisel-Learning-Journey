package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Ex2Test extends FreeSpec with ChiselScalatestTester {
    "ALU Test" in { 
    test(new Ex2()) { c=>
    c.io.in_A.poke(3.U)
    c.io.in_B.poke(2.U)
    c.io.alu_Op.poke(4.U)
    c.io.out.expect(1.U)
    //c.io.sum.expect(33.U)
    
    c.clock.step(100)
        }  
    }
}