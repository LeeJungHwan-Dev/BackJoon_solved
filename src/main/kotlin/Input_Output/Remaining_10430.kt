package Input_Output

fun main() {
    val (number1,number2,number3) = readLine()!!.split(' ').map { it.toInt() }
    println("${(number1 + number2)%number3}")
    println("${((number1 % number3)+(number2%number3))%number3}")
    println("${(number1 * number2)%number3}")
    println("${((number1 % number3)*(number2%number3))%number3}")
}