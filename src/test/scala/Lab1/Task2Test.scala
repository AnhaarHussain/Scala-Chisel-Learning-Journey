package Lab1

import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "Counter_up_down Test" in {
        test(new Task2(5)) { c =>
        //c.io.data_in.poke(7.U)
        //c.io.reload.poke(true.B)
        c.clock.step(100)
    
        
        }
    }
}


