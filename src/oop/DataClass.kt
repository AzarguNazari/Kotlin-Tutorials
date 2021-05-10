package oop

fun main(args: Array<String>) {
    var user1 = User("Ahmad", 10)
    var user2 = User("Mahmood", 100)

    println(user1.toString())
}

data class User(var name: String, var id: Int)