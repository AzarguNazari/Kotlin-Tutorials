package example.oop

fun main(args: Array<String>) {

    var circle = Circle(2.0)
    println(circle.getArea())

}

abstract class Shape{
    abstract var name: String
    abstract fun getArea(): Double
    open fun calculateHeight(){}
    fun randomMethod(){}
    constructor(){}
}

class Circle(): Shape(){
    override var name: String = "Circle"
    var radius: Double = 0.0
    override fun getArea(): Double {
        return radius * 2 * Math.PI
    }

    constructor(radius: Double): this(){
        this.radius = radius
    }
}