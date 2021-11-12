package Lab5

import chisel3._
import chisel3.util._

class Data_Packet [T <: Data](gen : T) extends Bundle {
    val address_bit = (UInt(5.W))
    val data_bit = gen
}

class Task2_Router(typ : UInt) extends Module {
    val io = IO(new Bundle {
    val in = Input(new Data_Packet(typ))
    val out = Output(new Data_Packet(typ))
})

    io.out <> io.in
    
}
