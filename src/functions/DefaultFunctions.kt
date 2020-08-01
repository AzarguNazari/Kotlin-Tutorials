package functions

fun main(args: Array<String>){

    val result1 = findVolume(1, 2, 3)
    val result2 = findVolume(2, 10)
    val result3 = findVolume(10)

    println("$result1")
    println("$result2")
    println("$result3")
}

fun findVolume(length: Int, breadth: Int = 10, height: Int = 10): Int{
    return length * breadth * height
}