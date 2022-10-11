package example.collections

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.stream.IntStream

fun main(){

    val currentTime = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm"))
    println(currentTime)
//    val names = listOf("first", "second")
//    if("second" in names){
//        println("Yes, it exist")
//    }

//    IntStream.rangeClosed(1, 10).map{ Person("name$it", age = 2, dateOfBirth = Date()) }
//        .map{ it -> Person(it.) }
//
//
//    val languageSet = setOf("java", "kotlin", "java")
//    languageSet.forEach{println(it)}
////
//    val studentCourse = mapOf("Chemistry" to 4, "Math" to 100)
//    studentCourse.forEach{
//        println("Course Name: " + it.key + ", student number: " + it.value)
//    }
//
//    languages.transferToUpperCase()
//    languages.forEach{println(it)}
}

fun List<String>.transferToUpperCase(){
    this.map { it.toUpperCase() }
}

data class Person(val name: String, val age: Int, val dateOfBirth: Date)