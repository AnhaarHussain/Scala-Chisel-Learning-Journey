package Lab4

import chisel3._
import chisel3.util._

object Opcode {
    val I_type1 = "b0000011".U
    val I_type2 = "b0010011".U
    val I_type3 = "b0011011".U
    val S_type = "b0100011".U
    val U_type1 = "b0010111".U
    val U_type2 = "b0110111".U
    val SB_type = "b1100011".U
    val UJ_type = "b1101111".U
}

import Opcode._


class LM_IO_Interface_ImmdValGen extends Bundle {
    val instr = Input(UInt(32.W))
    val immd_se = Output(SInt(32.W))
}

class Immediate_T extends Module {
    val io = IO (new LM_IO_Interface_ImmdValGen)
    val I_int = io.instr(31, 20)
    val S_inta = io.instr(11, 7)
    val S_intb = io.instr(31, 25)
    val Sb_inta = io.instr(7)
    val Sb_intb = io.instr(11, 8)
    val Sb_intc = io.instr(10, 5)
    val Sb_intd = io.instr(12)
    val U_int = io.instr(31, 12)
    val UJ_inta = io.instr(19, 12)
    val UJ_intb = io.instr(11)
    val UJ_intc = io.instr(10, 1)
    val UJ_intd = io.instr(20)

    when((io.instr(6,0) === I_type1) | (io.instr(6,0) === I_type2) | (io.instr(6,0) === I_type3)) {
        io.immd_se := I_int.asSInt
    }

    .elsewhen(io.instr(6,0) === S_type) {
        io.immd_se := (Cat(S_inta, S_intb)).asSInt
    }

    .elsewhen((io.instr(6,0) === U_type1) | (io.instr(6,0) === U_type2)) {
        io.immd_se := U_int.asSInt
    }

    .elsewhen(io.instr(6,0) === SB_type) {
        io.immd_se := (Cat(Sb_inta, Sb_intb, Sb_intc, Sb_intd)).asSInt
    }

    .otherwise {
        io.immd_se := (Cat(UJ_inta, UJ_intb, UJ_intc, UJ_intd)).asSInt
    }

}