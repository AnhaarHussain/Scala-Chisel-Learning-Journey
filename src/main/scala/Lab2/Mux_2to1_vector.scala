package Lab2

import chisel3._

class Mux_2to1_IO2 extends Bundle {
    val in_A = Input(UInt(4.W))
    val in_B = Input(UInt(4.W))
    val select = Input(Bool())
    val out = Output(UInt())
}


class Mux_2to1_vector extends Module {
    val io = IO(new Mux_2to1_IO2)

    io.out := Mux(io.select, io.in_A, io.in_B)
}


