package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class ALUTest extends FreeSpec with ChiselScalatestTester {
    "New ALU22 Test" in { 
    test(new ALU(32)) { c=>
    c.io.arg_x.poke(5.U)
    c.io.arg_y.poke(2.U)
    c.io.alu_oper.poke(20.U)
    //c.io.alu_out.expect(20.U)
    c.clock.step(100)
        }  
    }
}