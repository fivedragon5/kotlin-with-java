package com.lannstark.lec13

/*
    코틀링네서 중첩 클래스를 다루는 방법

    1.중첩 클래스의 종류
        - static 사용
            - 밖에 클래스를 직접적으로 참조 할 수 없는 클래스
        - static 비사용
            - 내부클래스
                - 밖에 클래스를 직접 참조 가능
            - 지역클래스
                - 메소드 내부에 클래스 정의
            - 익명 클래스
                - 일회성으로 무언가 쓸때
    2. 코틀린의 중첩 클래스와 내부 클래스
        - 기본적으로 바깥 클래스를 참조하지 않는다.
        - 바깥 클래스를 참조하고 싶다면 inner키워드를 사용한다.
            - this@바깥클래스

 */
fun main() {

}

class JavaHouseKt(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private val area: Double
    )
}
