package Lab1
import chisel3._
import chisel3.util._
import java.io.File

class Task2(n: Int) extends Module {
    val io = IO ( new Bundle {
        //val data_in = Input(UInt(n.W))
        //val reload = Input(Bool())
        val out = Output(Bool())
})

    val counter = RegInit(0.U(n.W))
    val max_count = RegInit(9.U(n.W))
    var flag = RegInit(1.B)
    
    when((counter === max_count) | (flag === 1.B)) {
        counter := counter - 1.U

                when(counter === 0.U) {
                    flag := 0.B
                }
    

                .otherwise { 
                    flag := 1.B
                }
                
    }
    

    .otherwise {
        counter := counter + 1.U
                

                when(counter === max_count) {
                    flag := 1.B
                }

                .otherwise {
                    flag := 0.B
                }
    }

    //val counter2 = (counter === max_count)
    
    io.out := counter((n-1).U)
    //io.out := counter2(0.B)
    
}  

    



                                                                        