package com.digian.kotlin.constructs.valueclasses.withvalueclass


fun main(args: Array<String>) {

}



@JvmInline
value class Width(val value: Int)

@JvmInline
value class Height(val value: Int)

data class Rectangle(val width: Width, val height: Height)



