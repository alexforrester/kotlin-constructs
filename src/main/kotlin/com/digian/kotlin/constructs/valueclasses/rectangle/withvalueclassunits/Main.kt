package com.digian.kotlin.constructs.valueclasses.rectangle.withvalueclassunits

@JvmInline
value class WidthInMillimetres(val value: Int)

@JvmInline
value class HeightInMillimetres(val value: Int)

val widthInMillimetres = WidthInMillimetres(10)
val heightInMillimetres = HeightInMillimetres(50)

data class Rectangle(val widthInMillimetres: WidthInMillimetres, val heightInMillimetres: HeightInMillimetres)

val rectangle = Rectangle(widthInMillimetres, heightInMillimetres)

// Will not compile
// val rectangle2 = Rectangle(heightInMillimetres, widthInMillimetres)

fun main() {

    println("Rectangle created with width ${rectangle.widthInMillimetres} and height ${com.digian.kotlin.constructs.valueclasses.rectangle.withvalueclass.rectangle.heightInMillimetres}")
}





