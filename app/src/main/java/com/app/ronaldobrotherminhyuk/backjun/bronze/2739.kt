package com.app.ronaldobrotherminhyuk.backjun.bronze

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()

    val token = br.readLine().toInt()
    for(i in 1..9){
        println("$token * $i = ${token*i}")
    }
    br.close()
}