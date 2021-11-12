package Lab6

import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester {
    "Task2 Test" in { 
    test(new Task2(1)) { c=>
    //c.io.out.expect(3.U)
    c.clock.step(100)
        }  
    }
}