package com.app.ronaldobrotherminhyuk.level_1

class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {

        var dangChum = 0
        var noDangChum = 0


        for (lotto in lottos.indices) {
            if (lottos[lotto] == 0) {
                noDangChum += 1
            }
            for (win_num in win_nums.indices) {
                if (lottos[lotto] == win_nums[win_num]) {
                    dangChum += 1
                }
            }
        }
        var answers: IntArray = intArrayOf(dangChum + noDangChum, dangChum)

        for (answer in answers.indices) {
            when {
                answers[answer] == 6 -> {
                    answers[answer] = 1
                }
                answers[answer] == 5 -> {
                    answers[answer] = 2
                }
                answers[answer] == 4 -> {
                    answers[answer] = 3
                }
                answers[answer] == 3 -> {
                    answers[answer] = 4
                }
                answers[answer] == 2 -> {
                    answers[answer] = 5
                }
                answers[answer] == 1 -> {
                    answers[answer] = 6
                }
                answers[answer] == 0 -> {
                    answers[answer] = 6
                }
            }
        }
        return answers
    }
}
