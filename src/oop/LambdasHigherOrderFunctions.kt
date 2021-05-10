package oop

fun main(args: Array<String>) {

    val program = Program()
    program.addTwoNumbers(2, 7)

    program.addTwoNumbers(2, 7, object: ActionInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })

    val test: String = "Nothing"
    val myLambda: (Int) -> Unit = {s: Int -> println(s)}
    program.addTwoNumbers(2, 7, myLambda)
}

class Program{

    fun addTwoNumbers(a: Int, b: Int, action: (Int) -> Unit){
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a: Int, b: Int, action: ActionInterface){
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int){
        val sum = a + b
        println(sum)
    }

}

interface ActionInterface{
    fun execute(sum: Int)
}