package com.digian.kotlin.constructs.valueclasses.name

interface NameFormat {
    fun containsSpaceCharacter(): Boolean
}

@JvmInline
value class Name(val value: String) : NameFormat {
    init {
        require(value.isNotEmpty()) {
            "Name shouldn't be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName".trim()) {
        require(firstName.isNotBlank() && lastName.isNotBlank()) {
            "First name and Last name should not be blank"
        }
    }

    val length: Int
        get() = value.length

    fun isLongName() = value.length > 20

    override fun containsSpaceCharacter() = value.contains(" ")
}

fun main() {
    val name1 = Name("Sarah Smith")
    val name2 = Name("Sarah", "Smith")
    println(name1.length) // property getter is called as a static method
    println(name2.isLongName()) // function is called as a static method
    println(name2.containsSpaceCharacter()) // overridden function is called as a static method
}