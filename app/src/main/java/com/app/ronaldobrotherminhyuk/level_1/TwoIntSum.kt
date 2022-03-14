package com.app.ronaldobrotherminhyuk.level_1

class TwoIntSum {
    fun solution(a: Int, b: Int): Long {
        //정답을 Int -> Long 으로 변환하면 오류 난다. 처음부터 Long으로 선언
        var answer = 0L

        if (a < b) {
            for (i in a..b) {
                answer += i
            }
        } else {
            for (i in b..a) {
                answer += i
            }
        }
        return answer
    }
}