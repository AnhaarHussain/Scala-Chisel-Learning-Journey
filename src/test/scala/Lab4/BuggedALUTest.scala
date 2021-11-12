package Lab4

import org.scalatest._
import chiseltest._
import chisel3._

class BuggedALUTest extends FreeSpec with ChiselScalatestTester {
    "New Bugged ALU Test" in { 
    test(new BuggedALU()) { c=>
    c.io.in_A.poke(3.U)
    c.io.in_B.poke(2.U)
    c.io.alu_Op.poke(4.U)
    c.io.out.expect(1.U)
    //c.io.sum.expect(33.U)
    
    c.clock.step(100)
        }  
    }
}