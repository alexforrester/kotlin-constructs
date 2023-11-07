package com.digian.kotlin.constructs.valueclasses.employee

import com.digian.kotlin.constructs.valueclasses.name.Name
import com.digian.kotlin.constructs.valueclasses.name.NameFormat

class EmployeeNameInterface(val userId: String, val name: NameFormat, val age: Int, val occupation: Occupation)

fun main() {

    val userId = "sarahsmith"
    val name = Name("Sarah Smith")
    val age = 26
    val occupation = Occupation("Chef")
    val employee = EmployeeNameInterface(userId, name, age, occupation)

    println("Employee's userId is ${employee.userId}")
    println("Employee's name has Space Character? ${employee.name.containsSpaceCharacter()}")
    println("Employee's age is ${employee.age}")
    println("Employee's occupation is ${employee.occupation.value}")
}