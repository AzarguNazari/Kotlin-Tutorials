package example.controlFlow

fun main(){

    val a = 12
    val b = 5
    val max = if(a < b) b else a

    val max2 = if(a > b){
        println("A is bigger")
        a
    }else{
        println("B is biggger")
        b
    }


    when(b){
        1 -> println("b is 1")
        3 -> println("b is 3")
        4 -> println("b is 5")
        else -> println("b has different value")
    }

    when(b){
        in 1..4 -> println("b is in range of 1 to 4")
        5, 6 -> println("b is either 5 or 6")
        else -> println("b has completely different value")
    }

    fun isIBAN(iban: String) = when(iban){
        is String -> iban.startsWith("DE") and iban.substring(2 until iban.length).all { it.isDigit() }
        else -> false
    }


    when{
        isIBAN("DE123123") -> println("seems starting is correct IBAN")
        isIBAN("GA512312") -> println("seems correct iban")
        else -> println("The entered IBAN is not correct")
    }


//    fun RuntimeNode.Request.getBody() = when(val response = executeRequest()){
//        is Success -> response.body
//        is HttpError -> throw HTTPException(response.status)
//    }


}

//fun executeRequest(){
//    return true
//}