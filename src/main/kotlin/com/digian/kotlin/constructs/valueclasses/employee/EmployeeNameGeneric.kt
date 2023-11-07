package com.digian.kotlin.constructs.valueclasses.employee

import com.digian.kotlin.constructs.valueclasses.name.Name

class EmployeeNameGeneric<T>(val userId: String, val name: T, val age: Int, val occupation: Occupation)

fun main() {

    val userId = "sarahsmith"
    val name = Name("Sarah Smith")
    val age = 26
    val occupation = Occupation("Chef")
    val employee = EmployeeNameGeneric(userId, name, age, occupation)

    println("Employee's userId is ${employee.userId}")
    println("Employee's name is ${employee.name.value}")
    println("Employee's age is ${employee.age}")
    println("Employee's occupation is ${employee.occupation.value}")
}