package example.expressions

fun main(args: Array<String>){

    for(i in 1..3){
        if(i == 2){
            continue
        }
        print("$i ")
    }

    println()

    loop@ for(i in 1..3){
        if(i == 2) continue@loop
        print("$i ")
    }
}