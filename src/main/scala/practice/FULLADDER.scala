package practice

import chisel3._

class fulladder extends Module{
    val io = IO(new Bundle{
        val a = Input(UInt(2.W))
        val b = Input(UInt(2.W))
        val output = Output(UInt(2.W))
    })

    io.output := io.a + io.b   
}