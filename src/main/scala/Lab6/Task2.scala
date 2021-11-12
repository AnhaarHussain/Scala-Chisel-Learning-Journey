package Lab6

import chisel3._
import chisel3.util._

class Task2(val max : Int = 1) extends Module {
    val io = IO(new Bundle {
        val out = Output(UInt((log2Ceil(max).W)))
})

    val counter = RegInit(0.U(5.W))

    val xor = (counter(4) ^ 1.B) === 1.U
    val mux_1 = Mux(xor , 0.U , counter + 1.U)
    

    io.out := mux_1

}