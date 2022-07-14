package Conditional

fun main() {
    val num1 = readLine()!!.toInt()
    val num2 = readLine()!!.toInt()


    if(num1 > 0 && num2 > 0){
        println(1)
    }else if(num1 < 0 && num2 > 0){
        println(2)
    }else if(num1 < 0 && num2 < 0){
        println(3)
    }else{
        println(4)
    }

}