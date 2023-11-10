package com.digian.kotlin.constructs.valueclasses.rectangle.basicwithunits



data class Rectangle(val widthInMillimetres: Int, val heightInMillimetres: Int)
val rectangle = Rectangle(widthInMillimetres = 10, heightInMillimetres = 50)

fun main() {

    val rectangle = Rectangle(10, 50)

    println("Rectangle created with width ${rectangle.widthInMillimetres} and height ${rectangle.heightInMillimetres}")

    val rectangle2 = Rectangle(50, 10)

    println("Rectangle created with width ${rectangle2.widthInMillimetres} and height ${rectangle2.heightInMillimetres}")

    val rectangle3 = Rectangle(widthInMillimetres = 50, heightInMillimetres = 10)

    println("Rectangle created with width ${rectangle3.widthInMillimetres} and height ${rectangle3.heightInMillimetres}")

}