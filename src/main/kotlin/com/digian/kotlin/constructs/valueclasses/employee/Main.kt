package com.digian.kotlin.constructs.valueclasses.employee


@JvmInline
value class Name(val value: String) {
    init {
        require(value.isNotEmpty()) {
            "Full name shouldn't be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName") {
        require(firstName.isNotBlank() && lastName.isNotBlank()) {
            "First name and Last name should not be empty"
        }
    }

    val length: Int
        get() = value.length

    fun greet() {
        println("Hello, $value")
    }
}

data class Occupation(val value: String)
class Employee(val userId: String, val name: Name, val age: Int, val occupation: Occupation)

fun main() {
    val name1 = Name("Sarah Smith")
    val name2 = Name("Sarah", "Smith")
    name1.greet() // the `greet()` function is called as a static method
    println(name2.length) // property getter is called as a static method
}



fun main(args: Array<String>) {

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





