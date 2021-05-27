```
    example.loop@ for(i in 1..10){
        if(i % 3 == 0) break@example.loop
    }

    example.loop@ for(i in 100 downTo 1){
        for(j in 10 downTo 1){
            if(i % j == 0) break@example.loop
        }
    }

    listOf(1,2,3).forEach example.loop@{
        if(it == 3) return@example.loop
        println(it)
    }

    listOf(1,2,3).forEach{
        if(it == 3) return@forEach
        println(it)
    }

    run example.loop@{
        listOf(1,2,3).forEach{
            if(it == 3) return@example.loop
        }
    }
```