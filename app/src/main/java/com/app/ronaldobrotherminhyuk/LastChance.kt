package com.app.ronaldobrotherminhyuk

// with를 통해  bufferReader 전역변수로 사용 가능
fun main() = with(System.`in`.bufferedReader()){

    // 정수 하나 읽기
    val num = readLine().toInt()

    // 공백 기준으로 읽기
    val nums = readLine().split(" ").map { it.toInt() }

    // 문자열을 char 배열로 받기
    val char = readLine().toCharArray()


    // 기본 출력
    print("hello");

    // bufferWriter
    val writer = System.out.bufferedWriter()
    writer.write("hello")
    // 하고 항상 flush 와 close 를 해주어야한다
    // flush -> write 한 값을 넘겨준다.
    writer.flush()
    writer.close()
    close()

    // 템플릿 $ 을 이용해 +를 이용하지 않아도 간단하게 문자열로 출력이 가능하다.
    val abc = "abc"
    println("$abc is a and b and c")

    // 배열 기본 선언
    // 항상 형을 앞에 지정
    val arr = intArrayOf(1,2,3)

    // 확장 함수로 배열을 선언한다.
    val array = IntArray(4) {it*3}
    // 내용물 전체를 확인하는 contentToString
    // 결과 [0,3,6,9]
    print(array.contentToString())

}