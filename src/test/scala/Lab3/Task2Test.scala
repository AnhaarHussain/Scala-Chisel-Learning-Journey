package Lab3

import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester {
    "Immediate Generator Test" in { 
    test(new Task2()) { c=>
    c.io.instr.poke("b00000000001000000000000010010011".U)
    c.io.immd_se.expect(2.S)
    
    c.clock.step(100)
        }  
    }
}