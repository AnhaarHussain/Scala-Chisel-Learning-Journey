package Lab4

import chisel3._
import chisel3.util._

object BranchSEL_T {
    val Beq = "b000".U(3.W)
    val Bne = "b001".U(3.W)
    val Blt = "b100".U(3.W)
    val Bge  = "b101".U(3.W)
    val Bltu = "b110".U(3.W)
    val Bgeu = "b111".U(3.W)

}

import BranchSEL_T._

class LM_IO_Interface_BranchControl extends Bundle {
    val funct3 = Input(UInt(3.W))
    val branch = Input(Bool())
    val arg_x = Input(UInt(32.W))
    val arg_y = Input(UInt(32.W))
    val br_taken = Output(Bool())
}

class Branch_T extends Module {
    val io = IO(new LM_IO_Interface_BranchControl)

    io.br_taken := 0.U
    
    switch(io.funct3) {
        is(Beq) {
            when((io.arg_x === io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }

        is(Bne) {
            when((io.arg_x =/= io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }

        is(Blt) {
            when((io.arg_x < io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }

        is(Bltu) {
            when((io.arg_x < io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }

        is(Bge) {
            when((io.arg_x >= io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }

        is(Bgeu) {
            when((io.arg_x >= io.arg_y) & (io.branch === 1.U)) {

            io.br_taken := 1.U
            }
        }
    }
}