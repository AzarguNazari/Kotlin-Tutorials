package example.functions

fun main(args: Array<String>) {

    println("Max value is " + max(2, 3))

}

fun max(x: Int, y: Int): Int = if(x > y) x else y