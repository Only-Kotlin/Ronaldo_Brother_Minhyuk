package com.app.ronaldobrotherminhyuk.backjun.bronze

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()
    // 5
    val token = br.readLine().toInt()

    for(i: Int in 1..token){
        for(j: Int in 1..token-i){
            print(" ")
        }
        for(p: Int in 1..i){
            print("*")
        }
        println("")
    }
    br.close()
}