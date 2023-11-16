package com.digian.kotlin.constructs.valueclasses.rectangle.withvalueclass

@JvmInline
value class Width(val value: Int)

@JvmInline
value class Height(val value: Int)

data class Rectangle(val widthInMillimetres: Width, val heightInMillimetres: Height)

val width = Width(10)
val height = Height(50)

val rectangle = Rectangle(widthInMillimetres = width, heightInMillimetres = height)

fun main() {


    println("Rectangle created with width ${rectangle.widthInMillimetres} and height ${rectangle.heightInMillimetres}")

    // Will not compile
    // val rectangle2 = Rectangle(height, width)

}
