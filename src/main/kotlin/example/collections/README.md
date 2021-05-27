## Types of example.collections
- Simple Collections (List, Set, Map)
- MutableCollection (MutableList, MutableSet, MutableMap)

```
    val languages = listOf("Java", "Kotlin", "Javascript")
    languages.forEach {println(it)}

    val languageSet = setOf("java", "kotlin", "java")
    languageSet.forEach{println(it)}

    val studentCourse = mapOf("Chemistry" to 4, "Math" to 100)
    studentCourse.forEach{println("Course Name: " + it.key + ", student number: " + it.value)}
    
    

```