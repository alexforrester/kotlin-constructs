package com.digian.kotlin.constructs.valueclasses.employee

import com.digian.kotlin.constructs.valueclasses.name.Name

class EmployeeNameCollection(val userId: String, val names: List<Name>, val age: Int, val occupation: Occupation)


fun main() {

    val userId = "sarahsmith"
    val name = Name("Sarah Smith")
    val age = 26
    val occupation = Occupation("Chef")

    val nameList = listOf(name)
    val employee = EmployeeNameCollection(userId, nameList, age, occupation)

    println("Employee's userId is ${employee.userId}")
    println("Employee's name is ${employee.names[0]}")
    println("Employee's age is ${employee.age}")
    println("Employee's occupation is ${employee.occupation.value}")

    println("List of names: ${nameList[0]}")
}