package com.app.ronaldobrotherminhyuk.programers.level_1

class UserReport {

    // 신고 횟수 제한 X
    // 서로 다른 유저 신고 가능
    // 한 유저를 여러번 신고 가능하나 중복으로 처리하고 3번이든 5번이든 신고해도 1번 신고한것으로 처리

    // k번 이상 신고된 유저는 정지된다.
    // 해당 유저에게 정지 사실을 메일로 발송.
    // 유저가 신고한 모든 내용을 취합해 마지막에 한꺼번에 게시판 이용 정지를 시킨다
    // 만약 k가 3일 때 a와 b라는 유저를 3번 신고해도 중복은 1번으로 처리하므로 report를 할 수 없다.
    // 이런 경우 report 메세지를 보내지 않는다.
    // k가 기준이 될 때의 중복까지 생각하자.

    // id_list -> 이용자의 ID가 담긴 문자열 배열 (신고한 사람은 누구인가)
    // report -> 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 (누굴 신고했냐)
    // report의 원소는 "이용자id 신고한id" 형태의 문자열이다.
    // muzi가 prodo를 신고했다? "muzi prodo"

    // k -> 정지의 기준이 된다. k가 2면 2번 이상, k가 3이면 3번 이상 신고를 먹은 사람이 정지된다. (누적 신고를 얼마나 당해야 report되나?)

    // 나중에 풀자.
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return answer

        for(i in report.indices){
            for(j in id_list.indices){

            }

        }


    }
}