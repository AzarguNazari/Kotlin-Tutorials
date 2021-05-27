package example



fun main(args: Array<String>) {

    val person1 = Person("Jamshid", 17)
    val person2 = Person("Jamshid", 17)

    print("hello")

}

data class Person(val name: String, val age: Int)