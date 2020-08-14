package OOP

fun main(args: Array<String>) {

    var person = Person("Ahmad", 100)
    println("name: ${person.name} and id ${person.id}")

}

class Person(var name: String){
    var id: Int = -1

    init{
        println("A new object of student is created with name of $name and id of $id")
    }

    constructor(name: String, id: Int): this(name){
        this.id = id
    }
}