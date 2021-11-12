package Lab5

import chisel3._
import chisel3.util._

class IO_InterfaceMux[T <: Data](gen:T) extends Bundle {
    val out = Output(gen.cloneType)
    val in1 = Input(gen.cloneType)
    val in2 = Input(gen.cloneType)
    val sel = Input(Bool())
}

class Ex2(extra : UInt) extends Module{
    val io = IO(new IO_InterfaceMux(extra))

    io.out := Mux(io.sel, io.in1, io.in2)
}




 

