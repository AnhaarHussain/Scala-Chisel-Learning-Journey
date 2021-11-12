package Lab2

import chisel3._


class Mux_2to1_IO extends Bundle {
    val in_A = Input(Bool())
    val in_B = Input(Bool())
    val select = Input(Bool())
    val out = Output(Bool())
}

class Ex1 extends Module {
    val io = IO(new Mux_2to1_IO)


    io.out := io.in_A & (~io.select) | io.in_B & io.select
}