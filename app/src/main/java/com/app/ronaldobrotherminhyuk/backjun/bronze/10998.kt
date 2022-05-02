package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    bw.write("${a*b}\n")

    bw.flush()
    bw.close()
    br.close()
}