package venus.linker

import venus.assembler.DebugInfo
import venus.riscv.Program

/**
 * Debug info with the program's name
 *
 * @param programName name of the program
 * @param dbg the debugging information
 */
data class ProgramDebugInfo(val programName: String, val dbg: DebugInfo)

/**
 * A program which also has attached debugging information.
 *
 * Generated by the [Linker].
 */
class LinkedProgram {
    val prog = Program()
    val dbg = ArrayList<ProgramDebugInfo>()
}