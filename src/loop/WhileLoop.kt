package loop

fun main(args: Array<String>){

    println("------ printing even numbers ")
    var i = 0
    while(i <= 10){
        if(i % 2 == 0){
            println("$i is even number")
        }
        i++
    }
}