package example.functions

//fun double(x: Int): Int {
//    return 2 * x
//}
//
//val result = double(2)
//
//Stream().read() // create instance of class Stream and call read()
//
//fun powerOf(number: Int, exponent: Int) { /*...*/ }
//
//fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) { /*...*/ }
//
//open class A {
//    open fun foo(i: Int = 10) { /*...*/ }
//}
//
//class B : A() {
//    override fun foo(i: Int) { /*...*/ }  // No default value is allowed
//}
//
//fun foo(bar: Int = 0, baz: Int) { /*...*/ }
//
//foo(baz = 1) // The default value bar = 0 is used
//
//fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) { /*...*/ }
//
//foo(1) { println("hello") }     // Uses the default value baz = 1
//foo(qux = { println("hello") }) // Uses both default values bar = 0 and baz = 1
//foo { println("hello") }        // Uses both default values bar = 0 and baz = 1
//
//fun reformat(
//        str: String,
//        normalizeCase: Boolean = true,
//        upperCaseFirstLetter: Boolean = true,
//        divideByCamelHumps: Boolean = false,
//        wordSeparator: Char = ' ') {
///*...*/
//}
/*
reformat(
    'String!',
    false,
    upperCaseFirstLetter = false,
    divideByCamelHumps = true,
    '_'
)


reformat('This is a long String!')
reformat('This is a short String!', upperCaseFirstLetter = false, wordSeparator = '_')

fun foo(vararg strings: String) { /*...*/ }

foo(strings = *arrayOf("a", "b", "c"))

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

fun printHello(name: String?) { ... }


fun double(x: Int): Int = x * 2

fun double(x: Int) = x * 2


fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

val list = asList(1, 2, 3)


val a = arrayOf(1, 2, 3)
val list = asList(-1, 0, *a, 4)

infix fun Int.shl(x: Int): Int { ... }

// calling the function using the infix notation
1 shl 2

// is the same as
1.shl(2)


class MyStringCollection {
    infix fun add(s: String) { /*...*/ }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}




fun dfs(graph: Graph) {
    fun dfs(current: Vertex, visited: MutableSet<Vertex>) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v, visited)
    }

    dfs(graph.vertices[0], HashSet())
}



fun dfs(graph: Graph) {
    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.add(current)) return
        for (v in current.neighbors)
            dfs(v)
    }

    dfs(graph.vertices[0])
}
class Sample {
    fun foo() { print("Foo") }
}


Sample().foo() // creates instance of class Sample and calls foo

fun <T> singletonList(item: T): List<T> { /*...*/ }


val eps = 1E-10 // "good enough", could be 10^-15

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))


val eps = 1E-10 // "good enough", could be 10^-15

private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (Math.abs(x - y) < eps) return x
        x = Math.cos(x)
    }
}


fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

val items = listOf(1, 2, 3, 4, 5)

// Lambdas are code blocks enclosed in curly braces.
items.fold(0, {
    // When a lambda has parameters, they go first, followed by '->'
    acc: Int, i: Int ->
    print("acc = $acc, i = $i, ")
    val result = acc + i
    println("result = $result")
    // The last expression in a lambda is considered the return value:
    result
})

// Parameter types in a lambda are optional if they can be inferred:
val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

// Function references can also be used for higher-order function calls:
val product = items.fold(1, Int::times)


class IntTransformer: (Int) -> Int {
    override operator fun invoke(x: Int): Int = TODO()
}

val intFunction: (Int) -> Int = IntTransformer()

val a = { i: Int -> i + 1 } // The inferred type is (Int) -> Int



val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
val twoParameters: (String, Int) -> String = repeatFun // OK

fun runTransformation(f: (String, Int) -> String): String {
    return f("hello", 3)
}
val result = runTransformation(repeatFun) // OK




val stringPlus: (String, String) -> String = String::plus
val intPlus: Int.(Int) -> Int = Int::plus

println(stringPlus.invoke("<-", "->"))
println(stringPlus("Hello, ", "world!"))

println(intPlus.invoke(1, 1))
println(intPlus(1, 2))
println(2.intPlus(3)) // extension-like call


max(strings, { a, b -> a.length < b.length })

fun compare(a: String, b: String): Boolean = a.length < b.length


val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }



val sum = { x: Int, y: Int -> x + y }


val product = items.fold(1) { acc, e -> acc * e }


run { println("...") }


ints.filter { it > 0 } // this literal is of type '(it: Int) -> Boolean'



ints.filter {
    val shouldFilter = it > 0
    shouldFilter
}

ints.filter {
    val shouldFilter = it > 0
    return@filter shouldFilter
}


strings.filter { it.length == 5 }.sortedBy { it }.map { it.toUpperCase() }

map.forEach { _, value -> println("$value!") }


fun(x: Int, y: Int): Int = x + y


fun(x: Int, y: Int): Int {
    return x + y
}

ints.filter(fun(item) = item > 0)

var sum = 0
ints.filter { it > 0 }.forEach {
    sum += it
}
print(sum)

val sum: Int.(Int) -> Int = { other -> plus(other) }


val sum = fun Int.(other: Int): Int = this + other

class HTML {
    fun body() { ... }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}

html {       // lambda with receiver begins here
    body()   // calling a method on the receiver object
}


lock(l) { foo() }

l.lock()
try {
    foo()
}
finally {
    l.unlock()
}

inline fun <T> lock(lock: Lock, body: () -> T): T { ... }


inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) { ... }


fun foo() {
    ordinaryFunction {
        return // ERROR: cannot make `foo` return here
    }
}


fun foo() {
    inlined {
        return // OK: the lambda is inlined
    }
}


fun hasZeros(ints: List<Int>): Boolean {
    ints.forEach {
        if (it == 0) return true // returns from hasZeros
    }
    return false
}

inline fun f(crossinline body: () -> Unit) {
    val f = object: Runnable {
        override fun run() = body()
    }
    // ...
}


fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

fun <T> TreeNode.findParentOfType(clazz: Class<T>): T? {
    var p = parent
    while (p != null && !clazz.isInstance(p)) {
        p = p.parent
    }
    @Suppress("UNCHECKED_CAST")
    return p as T?
}

inline fun <reified T> membersOf() = T::class.members

fun main(s: Array<String>) {
    println(membersOf<StringBuilder>().joinToString("\n"))
}

val foo: Foo
    inline get() = Foo()

var bar: Bar
    get() = ...
    inline set(v) { ... }


 inline var bar: Bar
    get() = ...
    set(v) { ... }

  */
