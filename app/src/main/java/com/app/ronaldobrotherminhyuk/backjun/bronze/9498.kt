package com.app.ronaldobrotherminhyuk.backjun.bronze

import java.util.*


fun main(args:Array<String>){
    val br = System.`in`.bufferedReader()

    val token = StringTokenizer(br.readLine())
    val num = token.nextToken().toInt()

    if(num in 90..100){
        println("A")
    }else if(num in 80..89){
        println("B")
    }else if(num in 70..79){
        println("C")
    }else if(num in 60..69){
        println("D")
    }else{
        println("F")
    }
}