package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Ex1Test extends FreeSpec with ChiselScalatestTester {
    "Ex1 Test" in { 
    test(new Ex1(1)) { c=>
    c.io.in(0).poke(1.B)
    c.io.in(1).poke(0.B)
    c.io.in(2).poke(0.B)
    c.io.in(3).poke(1.B)

    c.clock.step(100)
    
    c.io.out(0).expect(15.U)
    c.io.out(1).expect(15.U)
    c.io.out(2).expect(15.U)
    c.io.out(3).expect(15.U)
    
        }  
    }
}