package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args: Array<String>) {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val token = StringTokenizer(br.readLine())
    val num = token.nextToken().toInt()

    // 4의 배수이면서 100의 배수가 아닐 때 num%4 == 0 && num%100 != 0
    // 400의 배수일떄 num % 400 == 0

    if(num%4==0 && num%100!=0 || num % 400 == 0 ) println("1")
    else println("0")
}