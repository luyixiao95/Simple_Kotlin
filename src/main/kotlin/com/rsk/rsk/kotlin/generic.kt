package com.rsk.rsk.kotlin

class Generic {
}


fun main(args: Array<String>) {
    var names: List<String> = listOf("Luyi", "Ron")
    var name = names.itemAt(0)
}

fun <T> List<T>.itemAt(ndx: Int): T {
    return this[ndx]
}

class Node<T> (private val item: T) {
    fun value(): T {
        return item
    }
}