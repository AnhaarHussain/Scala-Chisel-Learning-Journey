package Lab6

import chisel3._

class Ex1(val init : Int = 1) extends Module {
    val io = IO(new Bundle {
    val in = Vec(4, Input(Bool()))
    val out = Vec(4, Output(UInt(4.W)))
})

    val state = RegInit(init.U(4.W))
    // register initialization
    // serial data in at LSB
    val nextState1 = (state << 1) | io.in(0)
    val nextState2 = (state << 1) | io.in(1)
    val nextState3 = (state << 1) | io.in(2)
    val nextState4 = (state << 1) | io.in(3)

    state := nextState1
    io.out(0) := state

    state := nextState2
    io.out(1) := state

    state := nextState3
    io.out(2) := state

    state := nextState4
    io.out(3) := state
}