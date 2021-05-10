package oop

fun main(args: Array<String>) {

    var dog = Dog()
    dog.bread = "labra"
    dog.name = "James"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 4
    cat.name = "Jilly"
    cat.eat()
    cat.meow()

    var animal = Animal()
    animal.name = "horse"
    animal.eat()

}

open class Animal{
    var name: String = ""
    fun eat(){
        println("eating")
    }
}

class Dog: Animal(){
    var bread: String = ""
    fun bark(){
        println("barking")
    }
}

class Cat: Animal(){
    var age: Int = -1
    fun meow(){
        println("Meow")
    }
}