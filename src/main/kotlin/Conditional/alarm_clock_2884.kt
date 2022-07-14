package Conditional

fun main() {
    var (hour,min) = readLine()!!.split(' ').map { it.toInt() }

    if(min < 45){
        min = 60 + min - 45
        hour--
        if(hour < 0){
            hour = 23
        }

    }else if(min >= 45){
        min -= 45
    }

    println("$hour $min")


}