package Lab2

import chisel3._
import chisel3.util._

class Task2 extends Module {
    val io = IO(new Bundle {
        val in = Vec(4, Input(Bool()))
        val sel = Vec(2, Input(Bool()))
        val shift_type = Input(Bool())
        val out = Vec(4, Output(Bool()))
        
    })

    val mux_shift1 = Mux(io.shift_type, io.in(0), 0.U)
    val mux_shift2 = Mux(io.shift_type, io.in(1), 0.U)
    val mux_shift3 = Mux(io.shift_type, io.in(2), 0.U)

    val Mux4_to_1_a = Mux(io.sel(1), Mux(io.sel(0), io.in(3), io.in(2)), Mux(io.sel(0), io.in(1), io.in(0)))
    val Mux4_to_1_b = Mux(io.sel(1), Mux(io.sel(0), mux_shift1, io.in(3)), Mux(io.sel(0), io.in(2), io.in(1)))
    val Mux4_to_1_c = Mux(io.sel(1), Mux(io.sel(0), mux_shift2, mux_shift1), Mux(io.sel(0), io.in(3), io.in(2)))
    val Mux4_to_1_d = Mux(io.sel(1), Mux(io.sel(0), mux_shift3, mux_shift2), Mux(io.sel(0), mux_shift1, io.in(3)))  
                    

    // Output
    io.out(0) := Mux4_to_1_a
    io.out(1) := Mux4_to_1_b
    io.out(2) := Mux4_to_1_c
    io.out(3) := Mux4_to_1_d

}