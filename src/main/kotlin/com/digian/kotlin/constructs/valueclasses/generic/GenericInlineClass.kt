package com.digian.kotlin.constructs.valueclasses.generic

import com.digian.kotlin.constructs.valueclasses.name.Name

sealed class Lesson
data object Maths : Lesson()
data object History : Lesson()
data object English : Lesson()

@JvmInline
value class Favourite<T>(val value: T)

@JvmName("getFavouriteLesson")
fun getFavourite(favouriteLesson: Favourite<Lesson>): String {

    return when (favouriteLesson.value) {
        is Maths -> "Maths"
        is English -> "English"
        is History -> "History"
    }
}

data class Student(val name: Name, val favouriteLesson: Favourite<Lesson>)

fun main() {

    val student = Student(Name("Sarah Smith"), favouriteLesson = Favourite(Maths))
    println("${student.name.value}'s favourite lesson is ${getFavourite(student.favouriteLesson)}")
}










