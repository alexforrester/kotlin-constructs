package com.digian.kotlin.constructs.valueclasses.rectangle.withwrappedvalueclasses


@JvmInline
value class Millimetres(val value: Int)

@JvmInline
value class Width(val millimetres: Millimetres)

@JvmInline
value class Height(val millimetres: Millimetres)

data class Rectangle(val width: Width, val height: Height)

fun main() {

    val height = Height(Millimetres(50))
    val width = Width(Millimetres(10))

    val rectangle = Rectangle(width, height)
    println("Rectangle width is ${rectangle.width.millimetres.value}")
    println("Rectangle height is ${rectangle.height.millimetres.value}")
}
