package com.digian.kotlin.constructs.valueclasses.employee

import com.digian.kotlin.constructs.valueclasses.name.Name


data class Occupation(val value: String)
class Employee(val userId: String, val name: Name, val age: Int, val occupation: Occupation)

fun main() {

    val userId = "sarahsmith"
    val name = Name("Sarah Smith")
    val age = 26
    val occupation = Occupation("Chef")
    val employee = Employee(userId, name, age, occupation)

    println("Employee's userId is ${employee.userId}")
    println("Employee's name is ${employee.name.value}")
    println("Employee's age is ${employee.age}")
    println("Employee's occupation is ${employee.occupation.value}")
}