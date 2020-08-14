package OOP

fun main(args: Array<String>) {

    val website = "www.example.com"
    println("is $website is valid website? " + website.isWebsite())
    println(2.maxValue(5))
}

fun String.isWebsite(): Boolean = this.endsWith(".com") || this.endsWith(".net")

fun Int.maxValue(y: Int): Int = if(this > y) this else y