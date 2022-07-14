package Conditional

import java.util.*

fun main() {
    val list = readLine()!!.split(' ').map { it.toInt() }
    var number = arrayOf<Int>(0,0,0)

    number.set(0,Collections.frequency(list,list.get(0)))
    number.set(1,Collections.frequency(list,list.get(1)))
    number.set(2,Collections.frequency(list,list.get(2)))

    if(number.maxOrNull() == 3){
        println(10000+list.get(0)*1000)
    }else if(number.maxOrNull() == 2){
        println(1000+list.get(2)*100)
        /**
         *
         * 이 부분 수정해야함
         *
         * */
    }else{
        println(list.maxOrNull()!!*100)
    }


}