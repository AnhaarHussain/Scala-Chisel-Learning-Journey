package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester {
    "BranchControl Test" in { 
    test(new Task1()) { c=>
    c.io.funct3.poke("b110".U)
    c.io.branch.poke(1.B)
    c.io.arg_x.poke(3.U)
    c.io.arg_y.poke(4.U)
    c.io.br_taken.expect(1.B)
    
    c.clock.step(1)
        }  
    }
}