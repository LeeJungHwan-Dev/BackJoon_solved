package Input_Output

fun main() {

    val (input1,input2) = readLine()!!.split(' ').map { it.toInt() }
    print("${input1 - input2}")

}