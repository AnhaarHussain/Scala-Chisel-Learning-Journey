package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Ex4Test extends FreeSpec with ChiselScalatestTester {
    "Ex4 Test" in { 
    test(new Ex4()) { c=>
    c.io.in.valid.poke(1.B)
    c.io.in.bits.poke(24.U)
    c.io.out.ready.poke(1.B)
    //c.io.out.expect(3.U)
    c.clock.step(100)
        }  
    }
}