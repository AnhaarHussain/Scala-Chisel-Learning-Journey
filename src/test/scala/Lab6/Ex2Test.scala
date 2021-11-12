package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Ex2Test extends FreeSpec with ChiselScalatestTester {
    "Ex2 Test" in { 
    test(new Ex2(5,0)) { c=>
    //c.io.out.expect(3.U)
    c.clock.step(100)
        }  
    }
}