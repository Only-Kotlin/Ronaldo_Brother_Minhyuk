package com.app.ronaldobrotherminhyuk.backjun.bronze

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val token = br.readLine().toInt()

    for(i in 1..token){
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
    br.close()
}