package com.rsk.rsk.kotlin

import java.util.Arrays

class Collections {
}

fun main(args: Array<String>) {
    val people: MutableList<Person?> = mutableListOf(Person(4), null)
    people.add(Person(5))
    var peopleNull: List<Person?> ? = null
    peopleNull = people

    for (person in people.filterNotNull()) {
        println(person.age)
    }
}

class  Person (val age: Int) {}