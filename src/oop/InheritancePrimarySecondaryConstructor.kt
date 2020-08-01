package oop

fun main(args: Array<String>) {

    var manager = Manager("Karim", "Manager")


}

open class Employee{
    var name: String = ""
    constructor(name: String){
        this.name = name
        println("Employee with name $name")
    }
}

class Manager: Employee{
    var position: String = ""
    constructor(name: String = "unknown", position: String = "manager"): super(name){
        super.name = name
        this.position = position
        println("Manager with name $name and position $position is created")
    }
}