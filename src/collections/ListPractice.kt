package collections

fun main(){

    val names = listOf("Ahmad", "Karim", "Jamil", "Nabi")                // unmodifiable list
    val mutableNames = mutableListOf("Ahmad", "Karim")  // mutable list
    val names2 = listOfNotNull("Ahmad", "Karim") // non-nullable list
    val names3 = arrayListOf("Ahmad", "Karim")              // array list

    // simple loop
    for(name in names){
        // println
    }

    // each loop
    names.forEach{
        // println(it)
    }

    // parallel run
    //names.parallelStream().forEach(::println)

    // in iterator way
    //names.iterator().forEachRemaining(::println)

    var ahmad = names.get(0)
//    println(ahmad)

    var ahmadIndex = names.indexOf("Ahmad")
//    println(ahmadIndex == 0)

    val last = names.last()
//    println(last)

    val subList = names.subList(0, 2)
//    println(subList)

    val drop = names.drop(1)
//    println(drop)

    val nums = listOf(1,2,3,4)
//    nums.reduce{
//        acc, num -> acc + num
//    }.also { println(it) }

//    nums.onEach { println(it) }

//    nums.all { num -> num % 2 == 0 }.also { println(it) }
}