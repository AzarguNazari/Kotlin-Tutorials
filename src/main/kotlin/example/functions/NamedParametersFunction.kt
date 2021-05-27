package example.functions

fun main(args: Array<String>) {

    println(findTheVolume(breadth = 20, height = 20))

}

fun findTheVolume(length: Int = 10, breadth: Int, height: Int): Int{
    return length * breadth * height
}