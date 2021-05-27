package example.oop

fun main(args: Array<String>) {

    println(MyClass.count)

    println(MyClass.typeOfCustomer())

}

class MyClass{

    companion object{
        var count: Int = -1
        fun typeOfCustomer(): String{
            return "VIP"
        }
    }

}