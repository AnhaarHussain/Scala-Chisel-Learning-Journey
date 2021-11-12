// package Lab2

// import chisel3._


// class IO_Interface extends Bundle {
//     val in0 = Input(UInt(4.W))
//     val in1 = Input(UInt(4.W))
//     val in2 = Input(UInt(4.W))
//     val in3 = Input(UInt(4.W))
//     val out = Vec(2, Output(Bool()))    // UInt(1.W))
// }
// class Encoder_4to1 extends Module {
//     val io = IO(new IO_Interface)
//     io.out(0) := Mux1H()           | 
// }