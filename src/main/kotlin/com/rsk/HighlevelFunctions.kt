package com.rsk

import java.util.Date

class HighlevelFunctions  {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var program: Program1 = Program1()
//            println(program.fibonacci(8 ))
//            program.fibonacci(8, object : Process{
//                override fun execute(value: Int) {
//                    println(value)
//                }
//            })
            program.fibonacci2(8) { println(it) }

            val m = Meeting()
            m.title = "Hi"
            m.When = Date(2012, 2, 2);
            m.who.add("Tom")

            with(m) {
                title = "FOOO"
                When = Date(22,2,2)
                who.add("Jone")
            }
            var meetings = listOf(Meeting("1"), Meeting("2"))
            var titles = meetings.asSequence().map { meeting: Meeting -> meeting.title }.filter { it.startsWith("1") }
            println(titles)
        }
    }
}

interface Process {
    fun execute(value: Int)
}

class Program1 {
    fun fibonacci(limit: Int, action: Process) {
        var pre = 0
        var prepre = 0
        var curr = 1

        for(i:Int in 1..limit) {
            action.execute(curr)
            var temp = curr
            prepre = pre
            pre = temp
            curr = pre + prepre
        }
    }
    fun fibonacci2(limit: Int, action: (Int) -> Unit) {
        var pre = 0
        var prepre = 0
        var curr = 1

        for(i:Int in 1..limit) {
            action(curr)
            var temp = curr
            prepre = pre
            pre = temp
            curr = pre + prepre
        }
    }
}

class Meeting(var title: String = "", var When: Date = Date(), val who: ArrayList<String> = ArrayList<String>()) {
    fun create(){}
}