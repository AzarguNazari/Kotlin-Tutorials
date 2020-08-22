package functions

fun main(){

    foo(1){ println()}
    foo(result = {
        println("Hello World")
    })

}

fun foo(a: Int = 0, b: Int = 1, result: () -> Unit){}