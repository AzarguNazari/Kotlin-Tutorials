package OOP

fun main(args: Array<String>) {

    CustomersData.count = 100
    CustomersData.typeOfCustomer()



}

open class SuperClass{
    open fun myMethod(str: String){
        println("Superclass is called")
    }
}

object CustomersData: SuperClass(){

    var count: Int = -1

    fun typeOfCustomer(): String{
        return "VIP"
    }

    override fun myMethod(str: String) {
        super.myMethod(str)
        println("Object customer data : $str")
    }
}