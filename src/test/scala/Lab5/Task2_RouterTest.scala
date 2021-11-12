package Lab5

import org.scalatest._
import chiseltest._
import chisel3._

class Task2_RouterTest extends FreeSpec with ChiselScalatestTester {
    "Router Test" in { 
    test(new Task2_Router(UInt(32.W))) { c=>
    c.io.in.data_bit.poke(1.U)
    c.io.in.address_bit.poke(3.U)
    c.io.out.data_bit.expect(1.U)
    c.io.out.address_bit.expect(3.U)
    c.clock.step(1)
        }  
    }
}