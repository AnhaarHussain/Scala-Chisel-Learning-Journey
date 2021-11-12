package Lab7

import org.scalatest._
import chiseltest._
import chisel3._

class Detect_SeqTest extends FreeSpec with ChiselScalatestTester {
    "Detect_Seq Test" in { 
    test(new Detect_Seq()) { c=>
    c.io.in.poke(1.B)
    c.io.out.expect(0.B)
    c.clock.step(100)
        }  
    }
}