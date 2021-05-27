package example.expressions

fun main(args: Array<String>){

    val x = 2
    val y = 3
    val maxValue: Int = if (x > y) x else y

    println("Max($x, $y) is $maxValue")
}