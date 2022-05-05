package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*
import kotlin.collections.ArrayList

fun main(args:Array<String>){

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val list = ArrayList<Int>(n)
    val token = StringTokenizer(br.readLine())

    repeat(n){
        list.add(token.nextToken().toInt())
    }
    print("${list.minOrNull()} ${list.maxOrNull()}")
    bw.flush()
    bw.close()
    br.close()
}