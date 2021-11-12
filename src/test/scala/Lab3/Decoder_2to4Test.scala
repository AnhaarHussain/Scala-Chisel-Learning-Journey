package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Decoder_2to4Test extends FreeSpec with ChiselScalatestTester {
    "New Decoder_4to1 Test" in { 
    test(new Decoder_2to4()) { c=>
    c.io.in.poke("b00".U)
    c.io.out.expect("b0001".U)
    
    c.clock.step(100)
        }
    }
}  