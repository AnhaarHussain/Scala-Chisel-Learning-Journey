package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Ex1Test extends FreeSpec with ChiselScalatestTester {
    "SwitchEncoder_4to2 Test" in { 
    test(new Ex1()) { c=>
    c.io.in.poke("b0010".U)
    
    c.clock.step(100)
    c.io.out.expect("b01".U)
    
        }  
    }
}