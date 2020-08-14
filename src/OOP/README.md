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