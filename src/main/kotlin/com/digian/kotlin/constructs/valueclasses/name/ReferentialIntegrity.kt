package com.digian.kotlin.constructs.valueclasses.name



@JvmInline
value class NumberExample(val value: Int)
fun main() {

    val numberExample1 = NumberExample(10)
    val numberExample2 = NumberExample(10)

    // Fails with message 'Identity equality for arguments of types NumberExample and NumberExample is forbidden'
    //println(numberExample1 === numberExample1)

    // Hashcode is
    println("numberExample1 hashCode ${numberExample1.hashCode()}")
    println("numberExample2 hashcode ${numberExample2.hashCode()}")
    println("Is numberExample1 equal to numberExample2 ${numberExample1.hashCode() == numberExample2.hashCode()}")
}