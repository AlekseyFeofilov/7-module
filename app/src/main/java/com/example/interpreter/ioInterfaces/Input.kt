package com.example.interpreter.ioInterfaces

interface Input : IO {
    val isDefault: Boolean
    
    //todo: apply color setting
    val color: String
    val autocomplete: Boolean
    
    fun parseValue(value: String)
    fun clone(): Input
    
    override fun convertToString() =
        "Input, $type, $description, $isDefault, ${getValue()}, $autocomplete"
    
    fun isEqual(input: Input) =
        this.isDefault == input.isDefault &&
                this.autocomplete == input.autocomplete &&
                this.description == input.description &&
                this.parent == input.parent &&
                this.type == input.type
    
    fun isEmpty() = getValue() == null
}