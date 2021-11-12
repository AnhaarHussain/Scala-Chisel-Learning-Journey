package Lab6

import chisel3._
import chisel3.util._

class Task3(val len : Int = 3) extends Module {
    val io = IO (new Bundle {
        val out = Vec(len , Output(Bool()))
        val load_in = Vec(len, Input(Bool()))
        val in = Input(Bool())
        val load = Input(Bool())
})

        val reg_0 = RegInit(1.U(32.W))
        val reg_1 = RegInit(1.U(32.W))
        val reg_2 = RegInit(1.U(32.W))
        
        val mux_0 = Mux(io.load, io.load_in(0), io.in)
        val mux_1 = Mux(io.load, io.load_in(1), io.out(0))
        val mux_2 = Mux(io.load, io.load_in(2), io.out(1))
        
        
        val out_0 = (reg_0 << 1) | mux_0
        val out_1 = (reg_1 << 1) | mux_1
        val out_2 = (reg_2 << 1) | mux_2

        reg_0 := out_0
        io.out(0) := reg_0

        reg_1 := out_1
        io.out(1) := reg_1

        reg_2 := out_2
        io.out(2) := reg_2
}