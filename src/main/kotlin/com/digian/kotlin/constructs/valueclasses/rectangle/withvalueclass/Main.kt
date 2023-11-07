package com.digian.kotlin.constructs.valueclasses.rectangle.withvalueclass

@JvmInline
value class Width(val value: Int)

@JvmInline
value class Height(val value: Int)

data class Rectangle(val width: Width, val height: Height)

val width = Width(10)
val height = Height(50)

val rectangle = Rectangle(width, height)

// Will not compile
// val rectangle2 = Rectangle(height, width)

fun main() {

    val width = Width(10)
    val height = Height(50)

    val rectangle = Rectangle(width, height)


}





