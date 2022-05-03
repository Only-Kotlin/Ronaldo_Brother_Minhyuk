package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args: Array<String>) {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val token = StringTokenizer(br.readLine())

    // 시간 값 들어옴
    val time = token.nextToken().toInt()
    // 분 값 들어옴
    val minute = token.nextToken().toInt()
    // 변한 시간 값 들어옴
    var timeSet = 0
    // 변한 분 값 들어옴
    var minuteSet = 0

    //  timeSet = time
    //  minuteSet = minute - 45

    if (45 - minute <= 0) {
        timeSet = time
        minuteSet = minute - 45
    }else if(minute < 45 && time == 0){
        timeSet = 23
        minuteSet = 15+minute
    }
    else if (minute < 45) {
        timeSet = time - 1
        minuteSet = 15 + minute
    }

    bw.write("$timeSet $minuteSet")
    bw.flush()
    bw.close()
    br.close()
}