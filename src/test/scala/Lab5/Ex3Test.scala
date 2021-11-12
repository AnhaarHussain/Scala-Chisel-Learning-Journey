package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class Ex3Test extends FreeSpec with ChiselScalatestTester {
    "Ex3 Test" in { 
    test(new Ex3(4,UInt(32.W))(_ + _)) { c=>
    c.io.in(0).poke(1.U)
    c.io.in(1).poke(2.U)
    c.io.in(2).poke(3.U)
    c.io.in(3).poke(4.U)

    c.io.out(0).expect(10.U)
    c.io.out(1).expect(10.U)
    c.io.out(2).expect(10.U)
    c.io.out(3).expect(10.U)
    c.clock.step(1)
        }  
    }
}