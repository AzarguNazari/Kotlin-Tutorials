//package collections
//
//fun main(){
//
//
////    val numbersSet = setOf("one", "two", "three", "four")
////    val emptySet = mutableSetOf<String>()
//
//
////    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
//
////    val empty = emptyList<String>()
//
////    val doubled = List(3, { it * 2 })  // or MutableList if you want to change its content later
////    println(doubled)
//
////    val linkedList = LinkedList<String>(listOf("one", "two", "three"))
////    val presizedSet = HashSet<Int>(32)
//
////    val sourceList = mutableListOf(1, 2, 3)
////    val copyList = sourceList.toMutableList()
////    val readOnlyCopyList = sourceList.toList()
////    sourceList.add(4)
////    println("Copy size: ${copyList.size}")
////
//////readOnlyCopyList.add(4)             // compilation error
////    println("Read-only copy size: ${readOnlyCopyList.size}")
//
//    val sourceList = mutableListOf(1, 2, 3)
//    val copySet = sourceList.toMutableSet()
//    copySet.add(3)
//    copySet.add(4)
//    println(copySet)
//
//    val sourceList = mutableListOf(1, 2, 3)
//    val referenceList = sourceList
//    referenceList.add(4)
//    println("Source size: ${sourceList.size}")
//
//
//
//    val sourceList = mutableListOf(1, 2, 3)
//    val referenceList: List<Int> = sourceList
////referenceList.add(4)            //compilation error
//    sourceList.add(4)
//    println(referenceList) // shows the current state of sourceList
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3)
//
//
//    val numbers = setOf(1, 2, 3)
//    println(numbers.map { it * 3 })
//    println(numbers.mapIndexed { idx, value -> value * idx })
//
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length })
//
//
//    // Iterator
//
//    val numbers = listOf("one", "two", "three", "four")
//    val numbersIterator = numbers.iterator()
//    while (numbersIterator.hasNext()) {
//        println(numbersIterator.next())
//    }
//
//    val numbers = listOf("one", "two", "three", "four")
//    for (item in numbers) {
//        println(item)
//    }
//
//    val numbers = listOf("one", "two", "three", "four")
//    numbers.forEach {
//        println(it)
//    }
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    val listIterator = numbers.listIterator()
//    while (listIterator.hasNext()) listIterator.next()
//    println("Iterating backwards:")
//    while (listIterator.hasPrevious()) {
//        print("Index: ${listIterator.previousIndex()}")
//        println(", value: ${listIterator.previous()}")
//    }
//
//
//    val numbers = mutableListOf("one", "two", "three", "four")
//    val mutableIterator = numbers.iterator()
//
//    mutableIterator.next()
//    mutableIterator.remove()
//    println("After removal: $numbers")
//
//
//    val numbers = mutableListOf("one", "four", "four")
//    val mutableListIterator = numbers.listIterator()
//
//    mutableListIterator.next()
//    mutableListIterator.add("two")
//    mutableListIterator.next()
//    mutableListIterator.set("three")
//    println(numbers)
//
//
//    if (i in 1..4) {  // equivalent of 1 <= i && i <= 4
//        print(i)
//    }
//
//    for (i in 1..4) print(i)
//
//    for (i in 4 downTo 1) print(i)
//
//    for (i in 1..8 step 2) print(i)
//    println()
//    for (i in 8 downTo 1 step 2) print(i)
//
//    for (i in 1 until 10) {       // i in [1, 10), 10 is excluded
//        print(i)
//    }
//
//    val versionRange = Version(1, 11)..Version(1, 30)
//    println(Version(0, 9) in versionRange)
//    println(Version(1, 20) in versionRange)
//
//
//    for (int i = first; i <= last; i += step) {
//        // ...
//    }
//
//
//    for (i in 1..10) print(i)
//
//    for (i in 1..8 step 2) print(i)
//
//    for (i in 1..9 step 3) print(i) // the last element is 7
//
//    for (i in 4 downTo 1) print(i)
//
//    println((1..10).filter { it % 2 == 0 })
//
//    val numbersSequence = sequenceOf("four", "three", "two", "one")
//
//    val numbers = listOf("one", "two", "three", "four")
//    val numbersSequence = numbers.asSequence()
//
//    val oddNumbers = generateSequence(1) { it + 2 } // `it` is the previous element
//    println(oddNumbers.take(5).toList())
////println(oddNumbers.count())     // error: the sequence is infinite
//
//    val oddNumbersLessThan10 = generateSequence(1) { if (it < 10) it + 2 else null }
//    println(oddNumbersLessThan10.count())
//
//    val oddNumbers = sequence {
//        yield(1)
//        yieldAll(listOf(3, 5))
//        yieldAll(generateSequence(7) { it + 2 })
//    }
//    println(oddNumbers.take(5).toList())
//
//    val words = "The quick brown fox jumps over the lazy dog".split(" ")
//    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
//            .map { println("length: ${it.length}"); it.length }
//            .take(4)
//
//    println("Lengths of first 4 words longer than 3 chars:")
//    println(lengthsList)
//
//    val words = "The quick brown fox jumps over the lazy dog".split(" ")
////convert the List to a Sequence
//    val wordsSequence = words.asSequence()
//
//    val lengthsSequence = wordsSequence.filter { println("filter: $it"); it.length > 3 }
//            .map { println("length: ${it.length}"); it.length }
//            .take(4)
//
//    println("Lengths of first 4 words longer than 3 chars")
//// terminal operation: obtaining the result as a List
//    println(lengthsSequence.toList())
//
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    numbers.filter { it.length > 3 }  // nothing happens with `numbers`, result is lost
//    println("numbers are still $numbers")
//    val longerThan3 = numbers.filter { it.length > 3 } // result is stored in `longerThan3`
//    println("numbers longer than 3 chars are $longerThan3")
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    val filterResults = mutableListOf<String>()  //destination object
//    numbers.filterTo(filterResults) { it.length > 3 }
//    numbers.filterIndexedTo(filterResults) { index, _ -> index == 0 }
//    println(filterResults) // contains results of both operations
//
//
//
//    // filter numbers right into a new hash set,
//// thus eliminating duplicates in the result
//    val result = numbers.mapTo(HashSet()) { it.length }
//    println("distinct item lengths are $result")
//
//    val numbers = mutableListOf("one", "two", "three", "four")
//    val sortedNumbers = numbers.sorted()
//    println(numbers == sortedNumbers)  // false
//    numbers.sort()
//    println(numbers == sortedNumbers)  // true
//
//
//    val numbers = setOf(1, 2, 3)
//    println(numbers.map { it * 3 })
//    println(numbers.mapIndexed { idx, value -> value * idx })
//
//
//    val numbers = setOf(1, 2, 3)
//    println(numbers.mapNotNull { if ( it == 2) null else it * 3 })
//    println(numbers.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })
//
//
//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    println(numbersMap.mapKeys { it.key.toUpperCase() })
//    println(numbersMap.mapValues { it.value + it.key.length })
//
//
//    val colors = listOf("red", "brown", "grey")
//    val animals = listOf("fox", "bear", "wolf")
//    println(colors zip animals)
//
//    val twoAnimals = listOf("fox", "bear")
//    println(colors.zip(twoAnimals))
//
//    val colors = listOf("red", "brown", "grey")
//    val animals = listOf("fox", "bear", "wolf")
//
//    println(colors.zip(animals) { color, animal -> "The ${animal.capitalize()} is $color"})
//
//
//    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
//    println(numberPairs.unzip())
//
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length })
//
//
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    println(numbers.associateBy { it.first().toUpperCase() })
//    println(numbers.associateBy(keySelector = { it.first().toUpperCase() }, valueTransform = { it.length }))
//
//
//    val names = listOf("Alice Adams", "Brian Brown", "Clara Campbell")
//    println(names.associate { name -> parseFullName(name).let { it.lastName to it.firstName } })
//
//
//    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
//    println(numberSets.flatten())
//
//    val containers = listOf(
//            StringContainer(listOf("one", "two", "three")),
//            StringContainer(listOf("four", "five", "six")),
//            StringContainer(listOf("seven", "eight"))
//    )
//    println(containers.flatMap { it.values })
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    println(numbers)
//    println(numbers.joinToString())
//
//    val listString = StringBuffer("The list of numbers: ")
//    numbers.joinTo(listString)
//    println(listString)
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString(limit = 10, truncated = "<...>"))
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.joinToString { "Element: ${it.toUpperCase()}"})
//
//
//    // Filtering
//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3)
//
//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
//    println(filteredMap)
//
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    val filteredIdx = numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5)  }
//    val filteredNot = numbers.filterNot { it.length <= 3 }
//
//    println(filteredIdx)
//    println(filteredNot)
//
//
//    val numbers = listOf(null, 1, "two", 3.0, "four")
//    println("All String elements in upper case:")
//    numbers.filterIsInstance<String>().forEach {
//        println(it.toUpperCase())
//    }
//
//    val numbers = listOf(null, "one", "two", null)
//    numbers.filterNotNull().forEach {
//        println(it.length)   // length is unavailable for nullable Strings
//    }
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    val (match, rest) = numbers.partition { it.length > 3 }
//
//    println(match)
//    println(rest)
//
//
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    println(numbers.any { it.endsWith("e") })
//    println(numbers.none { it.endsWith("a") })
//    println(numbers.all { it.endsWith("e") })
//
//    println(emptyList<Int>().all { it > 5 })   // vacuous truth
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    val empty = emptyList<String>()
//
//    println(numbers.any())
//    println(empty.any())
//
//    println(numbers.none())
//    println(empty.none())
//
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    val plusList = numbers + "five"
//    val minusList = numbers - listOf("three", "four")
//    println(plusList)
//    println(minusList)
//
//
//    // Grouping
//
//    val numbers = listOf("one", "two", "three", "four", "five")
//
//    println(numbers.groupBy { it.first().toUpperCase() })
//    println(numbers.groupBy(keySelector = { it.first() }, valueTransform = { it.toUpperCase() }))
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.groupingBy { it.first() }.eachCount())
//
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.slice(1..3))
//    println(numbers.slice(0..4 step 2))
//    println(numbers.slice(setOf(3, 5, 0)))
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.take(3))
//    println(numbers.takeLast(3))
//    println(numbers.drop(1))
//    println(numbers.dropLast(5))
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.takeWhile { !it.startsWith('f') })
//    println(numbers.takeLastWhile { it != "three" })
//    println(numbers.dropWhile { it.length == 3 })
//    println(numbers.dropLastWhile { it.contains('i') })
//
//
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3))
//
//
//    val numbers = (0..13).toList()
//    println(numbers.chunked(3) { it.sum() })  // `it` is a chunk of the original collection
//
//
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.windowed(3))
//
//
//    val numbers = (1..10).toList()
//    println(numbers.windowed(3, step = 2, partialWindows = true))
//    println(numbers.windowed(3) { it.sum() })
//
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.zipWithNext())
//    println(numbers.zipWithNext() { s1, s2 -> s1.length > s2.length})
//
//
//
//    val numbers = linkedSetOf("one", "two", "three", "four", "five")
//    println(numbers.elementAt(3))
//
//    val numbersSortedSet = sortedSetOf("one", "two", "three", "four")
//    println(numbersSortedSet.elementAt(0)) // elements are stored in the ascending order
//
//
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.first())
//    println(numbers.last())
//
//
//    val numbers = listOf("one", "two", "three", "four", "five")
//    println(numbers.elementAtOrNull(5))
//    println(numbers.elementAtOrElse(5) { index -> "The value for index $index is undefined"})
//
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.first { it.length > 3 })
//    println(numbers.last { it.startsWith("f") })
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.firstOrNull { it.length > 6 })
//
//
//    val numbers = listOf(1, 2, 3, 4)
//    println(numbers.find { it % 2 == 0 })
//    println(numbers.findLast { it % 2 == 0 })
//
//
//    val numbers = listOf(1, 2, 3, 4)
//    println(numbers.random())
//
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.contains("four"))
//    println("zero" in numbers)
//
//    println(numbers.containsAll(listOf("four", "two")))
//    println(numbers.containsAll(listOf("one", "zero")))
//
//    val numbers = listOf("one", "two", "three", "four", "five", "six")
//    println(numbers.isEmpty())
//    println(numbers.isNotEmpty())
//
//    val empty = emptyList<String>()
//    println(empty.isEmpty())
//    println(empty.isNotEmpty())
//
//
//    // Ordering Collection
//
//    class Version(val major: Int, val minor: Int): Comparable<Version> {
//        override fun compareTo(other: Version): Int {
//            if (this.major != other.major) {
//                return this.major - other.major
//            } else if (this.minor != other.minor) {
//                return this.minor - other.minor
//            } else return 0
//        }
//    }
//
//    fun main() {
//        println(Version(1, 2) > Version(1, 3))
//        println(Version(2, 0) > Version(1, 5))
//    }
//
//
//    val lengthComparator = Comparator { str1: String, str2: String -> str1.length - str2.length }
//    println(listOf("aaa", "bb", "c").sortedWith(lengthComparator))
//
//
//    println(listOf("aaa", "bb", "c").sortedWith(compareBy { it.length }))
//
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    println("Sorted ascending: ${numbers.sorted()}")
//    println("Sorted descending: ${numbers.sortedDescending()}")
//
//    val numbers = listOf("one", "two", "three", "four")
//
//    val sortedNumbers = numbers.sortedBy { it.length }
//    println("Sorted by length ascending: $sortedNumbers")
//    val sortedByLast = numbers.sortedByDescending { it.last() }
//    println("Sorted by the last letter descending: $sortedByLast")
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    println("Sorted by length ascending: ${numbers.sortedWith(compareBy { it.length })}")
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.reversed())
//
//    val numbers = listOf("one", "two", "three", "four")
//    val reversedNumbers = numbers.asReversed()
//    println(reversedNumbers)
//
//
//    val numbers = mutableListOf("one", "two", "three", "four")
//    val reversedNumbers = numbers.asReversed()
//    println(reversedNumbers)
//    numbers.add("five")
//    println(reversedNumbers)
//
//
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.shuffled())
//
//
//    // Aggregate Collection
//    val numbers = listOf(6, 42, 10, 4)
//
//    println("Count: ${numbers.count()}")
//    println("Max: ${numbers.max()}")
//    println("Min: ${numbers.min()}")
//    println("Average: ${numbers.average()}")
//    println("Sum: ${numbers.sum()}")
//
//
//    val numbers = listOf(5, 42, 10, 4)
//    val min3Remainder = numbers.minBy { it % 3 }
//    println(min3Remainder)
//
//    val strings = listOf("one", "two", "three", "four")
//    val longestString = strings.maxWith(compareBy { it.length })
//    println(longestString)
//
//
//
//    val numbers = listOf(5, 42, 10, 4)
//    println(numbers.sumBy { it * 2 })
//    println(numbers.sumByDouble { it.toDouble() / 2 })
//
//
//
//    val numbers = listOf(5, 2, 10, 4)
//
//    val sum = numbers.reduce { sum, element -> sum + element }
//    println(sum)
//    val sumDoubled = numbers.fold(0) { sum, element -> sum + element * 2 }
//    println(sumDoubled)
//
////val sumDoubledReduce = numbers.reduce { sum, element -> sum + element * 2 } //incorrect: the first element isn't doubled in the result
////println(sumDoubledReduce)
//
//
//    val numbers = listOf(5, 2, 10, 4)
//    val sumDoubledRight = numbers.foldRight(0) { element, sum -> sum + element * 2 }
//    println(sumDoubledRight)
//
//
//    val numbers = listOf(5, 2, 10, 4)
//    val sumEven = numbers.foldIndexed(0) { idx, sum, element -> if (idx % 2 == 0) sum + element else sum }
//    println(sumEven)
//
//    val sumEvenRight = numbers.foldRightIndexed(0) { idx, element, sum -> if (idx % 2 == 0) sum + element else sum }
//    println(sumEvenRight)
//
//
//
//    val numbers = mutableListOf(1, 2, 3, 4)
//    numbers.add(5)
//    println(numbers)
//
//
//    val numbers = mutableListOf(1, 2, 5, 6)
//    numbers.addAll(arrayOf(7, 8))
//    println(numbers)
//    numbers.addAll(2, setOf(3, 4))
//    println(numbers)
//
//    val numbers = mutableListOf("one", "two")
//    numbers += "three"
//    println(numbers)
//    numbers += listOf("four", "five")
//    println(numbers)
//
//
//    val numbers = mutableListOf(1, 2, 3, 4, 3)
//    numbers.remove(3)                    // removes the first `3`
//    println(numbers)
//    numbers.remove(5)                    // removes nothing
//    println(numbers)
//
//    val numbers = mutableListOf(1, 2, 3, 4)
//    println(numbers)
//    numbers.retainAll { it >= 3 }
//    println(numbers)
//    numbers.clear()
//    println(numbers)
//
//    val numbersSet = mutableSetOf("one", "two", "three", "four")
//    numbersSet.removeAll(setOf("one", "two"))
//    println(numbersSet)
//
//
//    val numbers = mutableListOf("one", "two", "three", "three", "four")
//    numbers -= "three"
//    println(numbers)
//    numbers -= listOf("four", "five")
////numbers -= listOf("four")    // does the same as above
//    println(numbers)
//
//
//
//    val numbers = listOf(1, 2, 3, 4)
//    println(numbers.get(0))
//    println(numbers[0])
////numbers.get(5)                         // exception!
//    println(numbers.getOrNull(5))             // null
//    println(numbers.getOrElse(5, {it}))        // 5
//
//
//    val numbers = (0..13).toList()
//    println(numbers.subList(3, 6))
//
//    val numbers = listOf(1, 2, 3, 4, 2, 5)
//    println(numbers.indexOf(2))
//    println(numbers.lastIndexOf(2))
//
//
//    val numbers = mutableListOf(1, 2, 3, 4)
//    println(numbers.indexOfFirst { it > 2})
//    println(numbers.indexOfLast { it % 2 == 1})
//
//
//    val numbers = mutableListOf("one", "two", "three", "four")
//    numbers.sort()
//    println(numbers)
//    println(numbers.binarySearch("two"))  // 3
//    println(numbers.binarySearch("z")) // -5
//    println(numbers.binarySearch("two", 0, 2))  // -3
//
//
//    val productList = listOf(
//            Product("WebStorm", 49.0),
//            Product("AppCode", 99.0),
//            Product("DotTrace", 129.0),
//            Product("ReSharper", 149.0))
//
//    println(productList.binarySearch(Product("AppCode", 99.0), compareBy<Product> { it.price }.thenBy { it.name }))
//
//
//
//    val colors = listOf("Blue", "green", "ORANGE", "Red", "yellow")
//    println(colors.binarySearch("RED", String.CASE_INSENSITIVE_ORDER)) // 3
//
//
//    data class Product(val name: String, val price: Double)
//
//    fun priceComparison(product: Product, price: Double) = sign(product.price - price).toInt()
//
//    fun main() {
//        val productList = listOf(
//                Product("WebStorm", 49.0),
//                Product("AppCode", 99.0),
//                Product("DotTrace", 129.0),
//                Product("ReSharper", 149.0))
//
//        println(productList.binarySearch { priceComparison(it, 99.0) })
//    }
//
//
//    val numbers = mutableListOf("one", "five", "six")
//    numbers.add(1, "two")
//    numbers.addAll(2, listOf("three", "four"))
//    println(numbers)
//
//
//
//    val numbers = mutableListOf("one", "five", "three")
//    numbers[1] =  "two"
//    println(numbers)
//
//
//    val numbers = mutableListOf(1, 2, 3, 4)
//    numbers.fill(3)
//    println(numbers)
//
//    val numbers = mutableListOf(1, 2, 3, 4, 3)
//    numbers.removeAt(1)
//    println(numbers)
//
//    val numbers = mutableListOf(1, 2, 3, 4, 3)
//    numbers.removeFirst()
//    numbers.removeLast()
//    println(numbers)
//
//    val empty = mutableListOf<Int>()
//// empty.removeFirst() // NoSuchElementException: List is empty.
//    empty.removeFirstOrNull() //null
//
//    val numbers = mutableListOf("one", "two", "three", "four")
//
//    numbers.sort()
//    println("Sort into ascending: $numbers")
//    numbers.sortDescending()
//    println("Sort into descending: $numbers")
//
//    numbers.sortBy { it.length }
//    println("Sort into ascending by length: $numbers")
//    numbers.sortByDescending { it.last() }
//    println("Sort into descending by the last letter: $numbers")
//
//    numbers.sortWith(compareBy<String> { it.length }.thenBy { it })
//    println("Sort by Comparator: $numbers")
//
//    numbers.shuffle()
//    println("Shuffle: $numbers")
//
//    numbers.reverse()
//    println("Reverse: $numbers")
//
//
//    val numbers = setOf("one", "two", "three")
//
//    println(numbers union setOf("four", "five"))
//    println(setOf("four", "five") union numbers)
//
//    println(numbers intersect setOf("two", "one"))
//    println(numbers subtract setOf("three", "four"))
//    println(numbers subtract setOf("four", "three")) // same output
//
//
//
//    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
//    println(numbersMap.get("one"))
//    println(numbersMap["one"])
//    println(numbersMap.getOrDefault("four", 10))
//    println(numbersMap["five"])               // null
////numbersMap.getValue("six")      // exception!
//
//
//
//    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
//    println(numbersMap.keys)
//    println(numbersMap.values)
//
//
//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
//    println(filteredMap)
//
//
//    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
//    val filteredKeysMap = numbersMap.filterKeys { it.endsWith("1") }
//    val filteredValuesMap = numbersMap.filterValues { it < 10 }
//
//    println(filteredKeysMap)
//    println(filteredValuesMap)
//
//
//    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
//    println(numbersMap + Pair("four", 4))
//    println(numbersMap + Pair("one", 10))
//    println(numbersMap + mapOf("five" to 5, "one" to 11))
//
//
//    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
//    println(numbersMap - "one")
//    println(numbersMap - listOf("two", "four"))
//
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    numbersMap.put("three", 3)
//    println(numbersMap)
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
//    numbersMap.putAll(setOf("four" to 4, "five" to 5))
//    println(numbersMap)
//
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    val previousValue = numbersMap.put("one", 11)
//    println("value associated with 'one', before: $previousValue, after: ${numbersMap["one"]}")
//    println(numbersMap)
//
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2)
//    numbersMap["three"] = 3     // calls numbersMap.put("three", 3)
//    numbersMap += mapOf("four" to 4, "five" to 5)
//    println(numbersMap)
//
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
//    numbersMap.remove("one")
//    println(numbersMap)
//    numbersMap.remove("three", 4)            //doesn't remove anything
//    println(numbersMap)
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "threeAgain" to 3)
//    numbersMap.keys.remove("one")
//    println(numbersMap)
//    numbersMap.values.remove(3)
//    println(numbersMap)
//
//    val numbersMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
//    numbersMap -= "two"
//    println(numbersMap)
//    numbersMap -= "five"             //doesn't remove anything
//    println(numbersMap)
//
//}