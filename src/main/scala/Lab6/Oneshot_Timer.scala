// package Lab6

// package Lab6

// import chisel3._
// import chisel3.util._

// class Oneshot_Timer extends Module {
//     val io = IO(new Bundle {
//         val reload = Input(Bool())
//         val timer_count = RegInit(0.U(8.W))
//         val done = timer_count === 0.U
//         val next = WireInit(0.U)
    
// })

//         when(io.reload) {
//         io.next := io.done
//         }

//         .elsewhen(!io.done) {
//         io.next := io.timer_count - 1.U
//         }

//         io.timer_count := io.next
// }