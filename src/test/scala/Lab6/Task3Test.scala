package Lab6

import org.scalatest._
import chiseltest._
import chisel3._
import chisel3.util._

class Task3Test extends FreeSpec with ChiselScalatestTester {
    "Parallel Shift_register Test" in { 
    test(new Task3(3)) { c=>
    c.io.in.poke(1.B)
    c.io.load_in(0).poke(1.B)
    c.io.load_in(1).poke(1.B)
    c.io.load_in(2).poke(0.B)
    c.io.load.poke(0.B)
    c.clock.step(40)
    // c.io.out(0).expect(1.U)
    
        }  
    }
}