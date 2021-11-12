package Lab2

import chisel3._
import chisel3.util._

class Ex3 extends Module{
    val io = IO(new Bundle{
        val in = Input(UInt(4.W))
        val out = Output(UInt(2.W))
    })

    io.out := Mux1H(io.in, Seq ("b00".U, "b01".U, "b10".U,"b11".U))

    
}