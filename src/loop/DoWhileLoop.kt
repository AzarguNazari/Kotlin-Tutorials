package loop

fun main(args: Array<String>){

    println("Print Even Numbers")
    var i = 0
    do{
        if(i % 2 == 0){
            println("$i is even number")
        }
        i++
    }while(i <= 10)
}