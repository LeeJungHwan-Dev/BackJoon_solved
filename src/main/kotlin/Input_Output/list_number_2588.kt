package Input_Output

fun main() {
    val firstNumber = readLine()!!.toInt()
    val lastNumber = readLine().toString()

    println("${firstNumber * lastNumber!!.get(2).toString().toInt()}")
    println("${firstNumber * lastNumber!!.get(1).toString().toInt()}")
    println("${firstNumber * lastNumber!!.get(0).toString().toInt()}")
    println("${firstNumber * lastNumber!!.toInt()}")
}