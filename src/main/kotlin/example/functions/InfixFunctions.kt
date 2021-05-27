package example.functions

fun main(args: Array<String>) {
    val x: Int = 18
    val y: Int = 20
    println(x findMaxValue y)
}

infix fun Int.findMaxValue(y: Int): Int{
    return if (this > y) this else y
}