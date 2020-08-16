package collections

fun main(){

    var names = setOf("Ahmad", "Karim", "Mahmood")
    val names2 = mutableSetOf("Ahmad", "Karim", "Mahmood")

    names.parallelStream()
    names.toString()
    names.stream()
    names.size
    names.spliterator()
    names.forEach{}
    names.contains("")
    names.containsAll(listOf("jamshid", "Karim"))
    names.isEmpty()
    names.iterator()
    names.minus("Ahmad")
    names.map { name -> name.length }.min()
    names.plus("New Name")
    names.plusElement("New Name")
    names.map { it.toUpperCase() }
    names.all { it.length > 0 }
    names.any{ it == "Jamshid" }
    names.asIterable()
    names.asSequence()
    names.chunked(2) // [[Ahmad, Karim], [Mahmood]]
    names.count()
    names.distinct()
    names.dropWhile { it == "Jamshid" }
    names.find { it == "Ahmad" }
    names.onEach { println(it) }
}