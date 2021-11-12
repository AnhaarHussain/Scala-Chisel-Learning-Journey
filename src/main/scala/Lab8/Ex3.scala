// package Lab8

// import chisel3._
// import chisel3.util._
// import chisel3.util.experimental.loadMemoryFromFile

// class Ex3 extends Module {
//     val io = IO(new Bundle {
//     val addr = Input(UInt(10.W))
//     val instr = Output(UInt(32.W))
// })

//     val mem = Mem(1024, (UInt(32.W)))
    
//     io.instr := mem(io.addr)
//     loadMemoryFromFile(mem, "/home/anhaar/Ex3txt")
// }