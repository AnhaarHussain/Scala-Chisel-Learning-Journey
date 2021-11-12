package Lab3

import chisel3._
import chisel3.util._

class LM_IO_Interface_BranchControl extends Bundle {
    val funct3 = Input(UInt(3.W))
    val branch = Input(Bool())
    val arg_x = Input(UInt(32.W))
    val arg_y = Input(UInt(32.W))
    val br_taken = Output(Bool())
}

class Task1 extends Module {
    val io = IO(new LM_IO_Interface_BranchControl)
    
    when((io.arg_x === io.arg_y) & (io.funct3 === "b000".U) & (io.branch === 1.U)) {
        io.br_taken := 1.U

    }.elsewhen ((io.arg_x =/= io.arg_y) & (io.funct3 === "b001".U) & (io.branch === 1.U)) {
        io.br_taken := 1.U

    }.elsewhen ((io.arg_x < io.arg_y) & ((io.funct3 === "b100".U) | (io.funct3 === "b110".U)) & (io.branch === 1.U)) {
        io.br_taken := 1.U

    }.elsewhen ((io.arg_x >= io.arg_y) & ((io.funct3 === "b101".U) | (io.funct3 === "b111".U)) & (io.branch === 1.U)) {
        io.br_taken := 1.U

    }.otherwise {
        io.br_taken := 0.U
    }
}