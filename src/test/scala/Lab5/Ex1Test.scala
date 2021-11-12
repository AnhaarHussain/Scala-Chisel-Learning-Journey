package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class Ex1Test extends FreeSpec with ChiselScalatestTester {
    "ALU2 Test" in { 
    test(new Ex1(4)) { c=>
    c.io.arg_x.poke(2.U)
    c.io.arg_y.poke(3.U)
    c.io.alu_oper.poke(9.U)
    c.io.alu_out.expect(1.U)
    c.clock.step(100)
        }  
    }
}