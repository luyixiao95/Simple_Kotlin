package com.rsk

class Types {
}

//Create a interface, and the public is by default
interface Time{
    fun setTime(hours: Int, min: Int = 0, secs: Int = 0)
    fun setTime(time: KTime) = setTime(time.hours)
}

interface EndOfTheWorld{
    fun setTime(time: KTime) {}

}

//Implement a class, we dont have implement or extend

class  YTime: Time {
    override fun setTime(hours: Int, min: Int, secs: Int){}
}

class KTime() {
    var hours = 0;
    var min = 0;
    var secs = 0;
}

fun main(args: Array<String>) {
    val Kevin = Anothertudents(1, "Kev")
    val Jones = Anothertudents(1, "Kev")
}

data class Anothertudents(val id: Int, var name: String) {

}