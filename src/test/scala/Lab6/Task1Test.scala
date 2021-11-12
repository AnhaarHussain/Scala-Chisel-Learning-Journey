package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester {
    "Counter Test" in { 
    test(new Task1(13)) { c=>
    //c.io.out.expect(3.U)
    c.clock.step(100)
        }  
    }
}