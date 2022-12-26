package com.rsk


object Courses {
    val allCourse = arrayListOf<Course>()
    fun init(){
        allCourse.add(Course(1, "Kotlin Fundamental"))
    }
}

class Course(val id:Int, var title: String) {

}