package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class SwitchDecoderTest extends FreeSpec with ChiselScalatestTester {
    "New SwitchDecoder2to4 Test" in { 
    test(new SwitchDecoder()) { c=>
    c.io.in.poke("b01".U)
    c.io.out.expect("b0010".U)
    
    c.clock.step(100)
        }  
    }
}