package com.digian.kotlin.constructs.valueclasses.name.basic

@JvmInline
value class Name(val value: String)
val name = Name("Sarah Smith")

fun main() {
    // Property name can be any valid identifier
    println("Name is ${name.value}")
}
