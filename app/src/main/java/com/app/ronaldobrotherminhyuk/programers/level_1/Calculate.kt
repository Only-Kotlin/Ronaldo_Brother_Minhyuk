package com.app.ronaldobrotherminhyuk.programers.level_1

class Calculate {
    fun solution(price: Int, money: Int, count: Int): Long {

        var sum = 0L

        for(i in 1..count){
            sum += price * i
        }

        return if(money - sum < 0) (sum - money) else 0

    }
}