package Lab4

import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation._

import scala.util.Random


import Opcode._


class ImmediateTester extends FreeSpec with ChiselScalatestTester {
    "Immediate Tester" in {
        test(new Immediate_T)
        { c =>
        // Immediate operations
        val array_Immediate = Array("h00700093", "h00329E13", "hFE629AE3")
        
        for (i <- 0 until 100) {

            val opcode = Random.nextInt(2)
            val ImmSEL = array_Immediate(opcode)
            // Immediate functional implementation using Scala match

            val result = ImmSEL match {
                case "h00700093" => 7
                case "h00329E13" => 3
                case "hFE629AE3" => -12
            }
            
            c.io.instr.poke(ImmSEL.U)
            c.clock.step(1)
            c.io.immd_se.expect(result.S)
        }

        c.clock.step(2)
        }
    }
}