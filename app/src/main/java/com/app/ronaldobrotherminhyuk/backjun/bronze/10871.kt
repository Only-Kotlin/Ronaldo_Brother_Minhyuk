package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()

    var token = StringTokenizer(readLine())

    val n = token.nextToken().toInt()
    val x = token.nextToken().toInt()

    token = StringTokenizer(readLine())

    for(i in 1..n){
        val num: Int = token.nextToken().toInt()
        if(num < x)bw.write("$num ")
    }
    bw.flush()
    bw.close()
    close()
}