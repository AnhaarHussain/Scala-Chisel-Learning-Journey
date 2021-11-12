package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class OperatorTest extends FreeSpec with ChiselScalatestTester {
    "New Operator Test" in { 
    test(new Operator(4,UInt(16.W))(_ + _)) { c=>
    c.io.in(0).poke(1.U)
    c.io.in(1).poke(2.U)
    c.io.in(2).poke(3.U)
    c.io.in(3).poke(4.U)
    c.io.out.expect(10.U)
    c.clock.step(1)
        }  
    }
}