package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester {
    "Adder_Task1 Test" in { 
    test(new Task1(32)) { c=>
    c.io.in0.poke(1.U)
    c.io.in1.poke(2.U)
    c.io.sum.expect(3.U)
    c.clock.step(1)
        }  
    }
}