package collections

fun main(){
    val languages = listOf("Java", "Kotlin", "Javascript")
//
//    languages.forEach {
//        println(it)
//    }
//
//    val languageSet = setOf("java", "kotlin", "java")
//    languageSet.forEach{println(it)}
//
//    val studentCourse = mapOf("Chemistry" to 4, "Math" to 100)
//    studentCourse.forEach{
//        println("Course Name: " + it.key + ", student number: " + it.value)
//    }

    languages.transferToUpperCase()
    languages.forEach{println(it)}
}

fun List<String>.transferToUpperCase(){
    this.map { it.toUpperCase() }
}

