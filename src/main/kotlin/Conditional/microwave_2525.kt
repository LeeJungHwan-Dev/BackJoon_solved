package Conditional

fun main() {
    var (hour,min) = readLine()!!.split(' ').map { it.toInt() }
    var addmin = readLine()!!.toInt()

    min += addmin

    if(min >= 60){
        hour += min / 60
        min -= (60 * (min / 60))
    }

    if(hour >= 24){
        hour -= 24
    }

    println("$hour $min")


}