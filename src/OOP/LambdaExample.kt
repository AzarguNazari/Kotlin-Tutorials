package OOP

fun main(args: Array<String>) {
    val program = MyProgram()
    program.addTwoNumber(2, 7) { x, y -> x + y}
}

class MyProgram{
    fun addTwoNumber(a: Int, b: Int, action: (Int, Int) -> Int){
        val result = action(a, b)
        println(result)
    }
}