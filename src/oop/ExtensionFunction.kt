package oop

fun main(args: Array<String>) {

    val student = Student()

    println(student.hasPassed(55))
    println(student.isJunior(4))
}

fun Student.isJunior(year: Int): Boolean{
    return year < 3
}


class Student{
    fun hasPassed(mark: Int): Boolean{
        return mark > 40
    }
}