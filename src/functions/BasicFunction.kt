package functions

fun main(args: Array<String>){
    println(add(2, 3.0))
}

fun add(x: Int = 2, y: Double = 3.0): Double{
    return x + y
}