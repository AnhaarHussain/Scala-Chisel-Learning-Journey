package Lab6

import chisel3._
import chisel3.util._

class Ex4 extends Module {
    val io = IO(new Bundle {
        val in = Flipped(Decoupled(UInt(8.W))) // valid = Input , ready = Output , bits = Input
        val out = Decoupled(UInt(8.W)) // valid = Output , ready = Input , bits = Output
})

        val queue = Queue(io.in, 5) // 5 - element queue
        val queue_1 = Queue(queue, 5) 

        io.out.valid := 1.B

        queue.nodeq()
        queue_1.nodeq()


        when((queue_1.valid && io.out.ready) === 1.U) {
            io.out.enq(queue_1.deq())
        }
         
        io.out <> queue
    
}