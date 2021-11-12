package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Encoder_4to2Test extends FreeSpec with ChiselScalatestTester {
    "New Encoder_4to2 Test" in { 
    test(new Encoder_4to2()) { c=>
    c.io.in.poke("b0010".U)
    c.io.out.expect("b01".U)
    
    c.clock.step(100)
        }
    }
}  