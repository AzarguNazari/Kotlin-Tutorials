```
class Person{}
```

```
class Empty
```

```
class Person constructor(firstName: String){}
```

```
class Person(firstName: String){}
```

```
class InitOrderDemo(name: String){
    val firstProperty = "First property".also(::println)
    
    init{
        println("First initializer block that prints")
    }

    val secondProperty = "Second property ${name.length}".also(::println)

    init{
        println("Second intializer block that prints ${name.lenght}")
    }
}
```

```
class Customer(name: String) {
    val customerKey = name.toUpperCase()
}
```

```
class Person(val firstName: String, val lastName: String, var age: Int) { /*...*/ }
```

```
class Customer public @Inject constructor(name: String) { /*...*/ }
```

```
class Person {
    var children: MutableList<Person> = mutableListOf<>()
    constructor(parent: Person) {
        parent.children.add(this)
    }
}
```

```
class Person(val name: String) {
    var children: MutableList<Person> = mutableListOf<>()
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}
```

```
class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}
```

```
class DontCreateMe private constructor () { /*...*/ }
```

```
class Customer(val customerName: String = "")

val invoice = Invoice()
val customer = Customer("Joe Smith")
```

## Inheritance
```
class Example // Implicitly inherits from Any
open class Base //Class is open for inheritance
```

```
open class Base(p: Int)
class Derived(p: Int) : Base(p)
```

```
class MyView : View {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}
```

```
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}
class Circle() : Shape() {
    override fun draw() { /*...*/ }
}
```

```
open class Rectangle() : Shape() {
    final override fun draw() { /*...*/ }
}
```

```
open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle : Shape() {
    override val vertexCount = 4
}
```

```
interface Shape {
    val vertexCount: Int
}

class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices

class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
}
```

```
open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int = 
        name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
    name: String,
    val lastName: String
) : Base(name.capitalize().also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}
```