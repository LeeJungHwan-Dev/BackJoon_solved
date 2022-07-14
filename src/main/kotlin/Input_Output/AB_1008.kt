package Input_Output

fun main() {

    val (input1,input2) = readLine()!!.split(' ').map { it.toDouble() }
    print("${input1 / input2}")

}