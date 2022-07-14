package Conditional

fun main() {

    val (A,B) = readLine()!!.split(' ').map { it.toInt() }

    if(A > B){
        println(">")
    }else if(A < B){
        println("<")
    }else if(A == B){
        println("==")
    }

}