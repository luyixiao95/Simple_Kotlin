@file:JvmName("DisplayFunctions")
import com.rsk.Person
import jdk.jfr.internal.LogLevel
import java.io.FileReader
import java.io.IOException
import java.lang.NumberFormatException
import java.util.Arrays
import java.util.StringJoiner
import java.util.TreeMap
import javax.print.attribute.standard.MediaSize.Other


fun main(args: Array<String>) {
    var h1 = Header("H1")
    var h2 = Header("H2")
    var h3 = h1 + h2
}



class Header(var name: String) {

}


operator infix fun Header.plus(other: Header): Header {
    return Header(this.name + other.name)
}

//fun display(message: String):Boolean {
//    println(message )
//    return true;
//}
//@JvmOverloads
//fun log(message: String, logLevel: Int = 1) {
//    println("The massage is $message with the log level of $logLevel")
//}





//class Question {
//    var answer: String? = ""
//    val question: String = "What is the answer to life, the universe and everything"
//    val currectAnswer: String = "43"
//    fun display() {
//        println("You said ${answer}")
//    }
//    fun printResult() {
//         when (answer) {
//            currectAnswer -> {
//                print("You were correct")
//            }
//            else -> {
//                print("Try again")
//            }
//        }
//    }
//    fun max(a:Int, b: Int):Int = if(a > b) a else b
