package Input_Output

fun main() {

    val (input1,input2) = readLine()!!.split(' ').map { it.toInt() }
    println("${input1 + input2}")
    println("${input1 - input2}")
    println("${input1 * input2}")
    println("${input1 / input2}")
    print("${input1 % input2}")

}