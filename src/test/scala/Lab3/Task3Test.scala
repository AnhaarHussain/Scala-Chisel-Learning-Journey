package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Task3Test extends FreeSpec with ChiselScalatestTester {
    "Decoder with valid Test" in { 
    test(new Task3()) { c=>
    c.io.in.poke("b01".U)
    c.io.out.bits.expect("b0010".U)
    c.io.out.valid.expect(0.B)
    
    c.clock.step(100)
        }
    }
}  


