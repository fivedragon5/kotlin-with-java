package com.lannstark.lec01

/*
    JAVA
        1.불변 final
        2.Primitive Tpye(long), Long의 구분
            연산할경우 기본 타입 사용 (boxing, unboxing 이 일어남)
        3.nullable 변수
        4.객체 인스턴스 화

    Kotlin
        1.불변 val
        2.구분 X -> 성능상 문제 없는가? / 타입 추론 가능
            코틀린 공식 문서)
                숫자, 문자, 불리언과 같은 몇몇 타입은 내부적으로 특별한 표현을 갖는다.
                이 타입들은 실행시 Primitive Value로 표현되지만, 코드에서는 평범한 클래스 처럼 보인다.
        3.nullable 변수
            type 뒤에 "?" 를 붙여 null값이 들어갈 수 있는지 표시 해 주어야 함
        4.객체 인스턴스화 시 new사용 X

    컬렉션에 element 추가 가능

    모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경


 */

fun main() {
    var number1 = 10L
    number1 = 5L

    val number2 = 10L
    //number2 = 10L 불가

    println(number1 + number2)

    // val 컬렉션에서는 element를 추가할 수 있다.

    var num1: Long? = null
    //var num2: Long  = null

    var person5 = Person("fad")
}
