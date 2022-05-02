package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*

fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()
    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()
    if (a>b){
        println(">")
    }
    else if(a<b){
        println("<")
    }
    else if(a==b){
        println("==")
    }
}