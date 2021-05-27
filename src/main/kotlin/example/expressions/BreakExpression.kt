package example.expressions

fun main(args: Array<String>){

    // Simply break
    for(i in 10 downTo 0){
        if(i == 5) {
           println("Loop is broken at value $i")
           break
        }
    }

    // Another type of break
    loop@for(i in 1..10){
        if(i == 4){
           println("Loop is broken at value $i")
           break@loop
        }
    }

}