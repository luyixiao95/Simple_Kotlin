package com.rsk

import javax.swing.JCheckBoxMenuItem
class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val Kevin: Student = Student("","",1)
            println("HIIII")
            val s = Student.createUndergrad("Hi" )
            println(s.getName())
        }
    }
}

abstract class Person(private var firstName: String, private var lastName: String){

    open fun getName():String {
        return "HIIIIIII$firstName $lastName"
    }
    abstract fun getAddress():String
}

open class Student(private var firstName: String, private var lastName: String, _id: Int, var tutor:String = ""): Person( firstName, lastName) {
    private val  id: Int
    init {
        this.id = _id
    }

    override fun getName(): String {
        return "HooooooIIII$firstName $lastName"    }

    override fun getAddress(): String {
        return ""
    }
    fun enroll(courseName: String) {
        var course = Courses.allCourse.filter { it.title == courseName }.firstOrNull()
    }
    companion object:XmlSerializer<Student> {
        fun createUndergrad(name: String): undergraduateStudent{
            return undergraduateStudent(name)
        }
        fun createGradStudent(name: String): graduateStudent {
            return graduateStudent(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }
    }
}

class graduateStudent(firstName: String) : Student(firstName, "", 1){

}
class undergraduateStudent(firstName: String): Student(firstName, "", 1) {
}

interface XmlSerializer<T> {
    fun toXml(item:T)
}