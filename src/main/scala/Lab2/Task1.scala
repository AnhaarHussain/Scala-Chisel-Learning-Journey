package Lab2
import chisel3 . _

class LM_IO_Interface1 extends Bundle {
    val s0 = Input(Bool())
    val s1 = Input(Bool())
    val s2 = Input(Bool())
    val out = Output(UInt(32.W))

}

class Task1 extends Module {
    val io = IO(new LM_IO_Interface1)

    io.out := Mux(io.s0, Mux(io.s1, 24.U, 8.U), Mux(io.s1, 16.U,
    Mux(io.s2, 32.U, 0.U)))
}
