package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args: Array<String>) {

    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()


    // 공백을 제외한 문자열의 개수를 출력함
    bw.write("${StringTokenizer(br.readLine()).countTokens()}")

    bw.flush()

    br.close()
    bw.close()
}