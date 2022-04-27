package com.example.interpreter.vm.instruction

import com.example.interpreter.vm.Env
import com.example.interpreter.vm.Instruction

class Bool : Instruction {
    override val isBasic: Boolean = true
    
    override fun exec(env: Env) = sequence<Instruction> { yield(this@Bool) }.iterator()
    
    constructor() : super() { TODO("NOT READY") }
}