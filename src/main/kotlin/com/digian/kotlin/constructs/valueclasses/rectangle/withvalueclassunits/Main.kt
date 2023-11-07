package com.digian.kotlin.constructs.valueclasses.rectangle.withvalueclassunits

@JvmInline
value class WidthInMillimetres(val value: Int)

@JvmInline
value class HeightInMillimetres(val value: Int)

data class Rectangle(val widthInMillimetres: WidthInMillimetres, val heightInMillimetres: HeightInMillimetres)

val widthInMillimetres = WidthInMillimetres(100)
val heightInMillimetres = HeightInMillimetres(500)

fun main() {

    val rectangle = Rectangle(widthInMillimetres, heightInMillimetres)

    // Will not compile
    // val rectangle2 = Rectangle(heightInMillimetres, widthInMillimetres)
}





