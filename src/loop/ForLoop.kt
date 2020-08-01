package loop

fun main(args: Array<String>){

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

}
