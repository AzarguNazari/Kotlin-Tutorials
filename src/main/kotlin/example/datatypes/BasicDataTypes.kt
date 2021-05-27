package example.datatypes

fun main(){

    val one = 1
    val threeBillion = 3000000000
    val oneLong = 1L
    val oneByte: Byte = 1

    val pi = 3.14
    val e = 2.71
    val eFloat = 2.718f

    val oneMillion = 1_000_000
    val creditCardNumber = 1412_3123_1234_4123L
    val socialSecurityNumber = 999_99_999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11000_0011

    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 1000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)  // true
    println(boxedB === anotherBoxedB)  // false

    val value = 2
    val changeToDouble: Double = value.toDouble()
    val changeToFloat: Float = value.toFloat()
    val changeToLong: Long = value.toLong()
    val changeToByte: Byte = value.toByte()
    val changeToChar: Char = value.toChar()
    val changeToShort: Short = value.toShort()

    // bitwise operations
    // shl(bits)    signed shift left
    // shf(bits)    signed shift right
    // ushr(bits)   unsigned shift right
    // and(bits)    bitwise and
    // or(bits)     bitwise or
    // xor(bits)    bitwise xor
    // inv()        bitwise inversion

    val x = (1 shl 2) and 0x00ff000

    // array
    val asc = Array(5){i -> (i + i).toString()}
    asc.forEach{println(it)}


    // primitive array
    val threeValueArray: IntArray = intArrayOf(1,2,3)
    threeValueArray[0] = threeValueArray[1] +threeValueArray[2]

    // unsigned
    val unsignedByte : UByte = 1u
    val unsignedShort: UShort = 1u
    //...   `          ULong, UDouble,


    val text = "Simple Text"
    val multipleLined = """
            First line
            Second Line
        """.trimMargin()


    val i = 10
    println("i = $i")
}