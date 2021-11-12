package Lab7

import chisel3._
import chisel3.util._

class Ex1_Arbiter extends Module {
    val io = IO(new Bundle {
        val in = Flipped(Vec(2, Decoupled(UInt(8.W))))
        val out = Decoupled(UInt(8.W)) 
})

        val queue = Queue(io.in(0), 5) 
        val queue_1 = Queue(io.in(1), 5) 

        queue.nodeq()
        queue_1.nodeq()

        //io.out.bits := 0.U
        io.out.valid := 1.B
        //io.out.valid(1.B)

        val arb_priority = Module(new Arbiter(UInt(),2))

        arb_priority.io.in(0) <> queue
        arb_priority.io.in(1) <> queue_1

        // connect the output to consumer
        io.out <> arb_priority.io.out
    
}




