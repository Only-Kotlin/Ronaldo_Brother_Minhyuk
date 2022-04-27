package com.app.ronaldobrotherminhyuk.programers.level_1

class NewID {
    fun solution(new_id: String): String {
        var answer = new_id

        // regex가 정규화? 인가 쨋튼 다시 공부.
        val reg1 = Regex("[a-z0-9-_.]")
        val reg2 = Regex("[.]{2,}")

        // 소문자로 바꾸기.
        answer = answer.toLowerCase()
        var temp = StringBuilder()

        // containsMatchIn으로 소문자 숫자 빼기 밑줄 마침표 제외 모든 문자 제거.
        for (e in answer) {
            if (reg1.containsMatchIn(e.toString())) {
                temp.append(e)
            }
        }

        // .이 연속된 부분 (....) 등을 .으로 치환.
        answer = temp.toString().replace(reg2, ".")

        // 처음이나 끝에 .이 있으면 제거.
        if (answer.isNotEmpty() && answer.first() == '.') answer = answer.removeRange(0, 1)
        if (answer.isNotEmpty() && answer.last() == '.') answer = answer.removeRange(answer.length-1, answer.length)

        // 빈 문자열 a 대입.
        if (answer.isEmpty()) answer = "a"

        // 길이만큼 나머지 문자 제거.
        if (answer.length >= 16) {
            answer = answer.slice(0..14)
        }

        // 6단계에선 4단계 과정을 한번 더 해주는 이유는 위 과정을 거치고 마지막 문자가 .인 경우 제거해주기 위함.
        if (answer.isNotEmpty() && answer.first() == '.') answer = answer.removeRange(0, 1)
        if (answer.isNotEmpty() && answer.last() == '.') answer = answer.removeRange(answer.length-1, answer.length)

        // 마지막 단계에선 길이 2자 이하일 경우 마지막 문자를 끝에 붙이기 , 조건은 길이가 3이기 전까지.
        while (answer.length <= 2) {
            answer += answer[answer.length - 1]
        }

        return answer
    }
}