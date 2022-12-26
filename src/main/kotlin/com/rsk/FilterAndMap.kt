package com.rsk

class FilterAndMap {
}

fun main(args: Array<String>) {
     var ints = listOf(1,2,3, 4, 5)
     val smallInts = ints.filter { it  < 4}
    println(smallInts)
    val squareInts = ints.map { it * it }
    println(squareInts)
    val smallSquaredInt = ints.filter { it < 4 }.map { it * it }
    println(smallSquaredInt)

    val largerThanThree = {v: Int -> v > 3}
    val allInts = ints.all (largerThanThree)
    val anyInts = ints.any (largerThanThree)
    val numberOf = ints.count (largerThanThree)

    val findNumber = ints.find(largerThanThree)

    println(allInts)
    println(anyInts)
    println(numberOf)
    print(findNumber)
}

