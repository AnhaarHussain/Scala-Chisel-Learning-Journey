package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Shift_registerTest extends FreeSpec with ChiselScalatestTester {
    "Shift_register Test" in { 
    test(new shift_register(1)) { c=>
    c.io.in.poke(1.B)
    c.io.in.poke(1.B)
    c.io.in.poke(1.B)
    c.clock.step(3)
    c.io.out.expect(15.U)
    
        }  
    }
}