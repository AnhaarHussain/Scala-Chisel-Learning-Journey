package Lab2

import chisel3._
import  chiseltest._
import org.scalatest._

class Ex3Test extends FreeSpec with ChiselScalatestTester{
    "Encoder with Mux1H"  in{

        test(new Ex3()) {c=>
        c.io.in.poke("b1000".U)
        c.io.out.expect("b11".U)   
        
        c.clock.step(1)
             
        }
    }
}