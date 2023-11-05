package com.digian.kotlin.constructs.valueclasses.basic


fun main(args: Array<String>) {

    // Requires creating a Rectangle with width 10 and height 50
    val rectangle = Rectangle(10, 50)

    println("Rectangle created with width ${rectangle.width} and height ${rectangle.height}")

    val rectangle2 = Rectangle(50, 10)
    println("Rectangle created with width ${rectangle2.width} and height ${rectangle2.height}")

}


data class Rectangle(val width: Int, val height: Int)