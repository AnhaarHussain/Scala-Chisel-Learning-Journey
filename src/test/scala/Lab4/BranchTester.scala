package Lab4

import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation._

import scala.util.Random
import BranchSEL_T._

class BranchTester extends FreeSpec with ChiselScalatestTester {
    "Branch Tester" in {
        test(new Branch_T) 
        { c =>
        // ALU operations
        val array_Sb = Array(Beq, Bne, Blt, Bge, Bltu, Bgeu)
        
        for (i <- 0 until 100) {
            val src_a = Random.nextLong() & 0xFFFFFFFFL
            val src_b = Random.nextLong() & 0xFFFFFFFFL
            val arr = Random.nextInt(5)
            val branchSEL = array_Sb(arr)
            val branch1 = Random.nextBoolean() 
           
            // ALU functional implementation using Scala match

            val result = branchSEL match {
                case Beq => src_a == src_b
                case Bne => if(src_a != src_b)
                                1
                            else
                                0
                case Blt => if(src_a < src_b)
                                1
                            else
                                0
                case Bge => if(src_a >= src_b)
                                1
                            else
                                0
                case Bltu => if(src_a < src_b)
                                1
                            else
                                0
                case Bgeu => if(src_a >= src_b)
                                1
                            else
                                0
            }

            println(src_a)
            println(src_b)
            println(arr)
            println(branch1)
            println(result)

            c.io.arg_x.poke(src_a.U)
            c.io.arg_y.poke(src_b.U)

            val result1 =   if((result == true) & (branch1 == true))
                                true
                            else
                                false
            c.clock.step(1)
            c.io.br_taken.expect(result1.B)
            
            }
        c.clock.step(2)
    }
}
}