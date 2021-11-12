package Lab1

import org.scalatest._
import chiseltest._
import chisel3._

class Ex2Test extends FreeSpec with ChiselScalatestTester{
    "Counter Ex2 Test" in {
        test(new Ex2()) { c =>
        c.clock.step(100)
    
        
        }
    }
}