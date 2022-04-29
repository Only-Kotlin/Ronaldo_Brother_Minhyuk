package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*
import kotlin.math.pow

fun main(args:Array<String>){

    // pow -> 제곱수 구하기
    // sqrt -> 제곱근 구하기

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    // 숫자를 stringtokennizer로 받기
    val text = StringTokenizer(readLine())
    val count = text.countTokens()
    var sum = 0.0
    repeat(count){
       sum += text.nextToken().toDouble().pow(2)
    }
    println(String.format("%.0f",sum%10).toInt())

    bw.flush()
    bw.close()
    br.close()

}