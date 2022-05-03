package com.app.ronaldobrotherminhyuk.backjun.bronze

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val token = br.readLine().toInt()

    // 개행 꼭 해주기
    for(i in token downTo 1){
        bw.write("$i\n")
    }
    bw.flush()
    br.close()
    bw.close()
}