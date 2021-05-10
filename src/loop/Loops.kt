package loop

fun main(args: Array<String>){

//    forLoop()
    whileLoop()

}

fun forLoop(){

    // print even numbers
    println("------ Print Even Numbers -----")
    for(x in 1..10){
        if(x % 2 == 0){
            println("$x is even")
        }
    }

    println("------------")
    for(i in 5 downTo 0){
        for(x in i downTo 0){
            print("*")
        }
        println()
    }

    val simpleNumbers = listOf(1,3,4)
    for(num in simpleNumbers){
        if(num % 2 == 0) println("$num is even")
    }

    simpleNumbers.forEach{ if(it % 2 == 0) println("$it is even") }


    for(i in 6 downTo 0 step 2){
        println(i)
    }

    val intArray: IntArray = intArrayOf(1,2)
    for(i in intArray.indices){
        println("Index $i and value ${intArray[i]}")
    }

    for((index, value) in intArray.withIndex()){
        println("Index $index and value $value")
    }
}

fun whileLoop(){

    println("------ printing even numbers ")
    var i2 = 0
    while(i2 <= 10){
        if(i2 % 2 == 0){
            println("$i2 is even number")
        }
        i2++
    }

    println("Print Even Numbers")
    var i3 = 0
    do{
        if(i3 % 2 == 0){
            println("$i3 is even number")
        }
        i3++
    }while(i3 <= 10)


}
