package OOP

fun main(args: Array<String>) {

    var button = Button()
    button.click()
    button.onMouseOver()
    button.process()

}

interface ScreenService{
    fun click()
    fun onMouseOver(){
        println("you have moved the mouse")
    }
}

interface BackgroundThread{
    fun process(){
        println("Thread is working on background")
    }
}

class Button: ScreenService, BackgroundThread{
    override fun click() {
        println("butt is clicked")
    }

    override fun process() {
        super.process()
        println("Button is processed on background")
    }

    override fun onMouseOver() {
        super.onMouseOver()
        println("Mouse is moved on button")
    }
}

