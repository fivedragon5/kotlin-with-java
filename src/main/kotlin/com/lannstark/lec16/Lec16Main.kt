package com.lannstark.lec16

/*
    코틀린에서 다양한 함수를 다루는 방법
    1. 확장함수
        - 확장함수란?
            - Kotiln은 Java와 100%호환을 목적으로 함, Java를 그대로 두고 Kotlin을 덧 붙이고 싶은 니즈
              어떤 클래스 안에 메소드 처럼 호출 할 수 있지만 함수는 밖에 있게 하자.
            - 확장 함수
                - fun 확장하려는클래스.함수이름(파라미터): 리턴타입
                    - this를 이용해 실제 데이터 접근
                - 원래 사용하던 멤버함수 처럼 사용 가능
                - 확장 함수는 원본 클래스에 private, protected 멤버 접근이 안된다.
                - 멤버함수, 확장함수 중 멤버함수에 우선권이 있다.
                - 확장함수는 현재 타입을 기준으로 호출된다.

    2. infix 함수
        - 중위함수, 함수를 호출하는 새로운 방법
        - 멤버함수에도 붙일 수 있음

    3. inline 함수
        - 함수가 호출되는 대신 함수를 호출한 지점에 함수 본문을 그대로 복붙하고 싶은 경우
        - 함수를 파라미터 잔달할 때에 오버헤드를 줄일 수 있다.
            하지만 inline함수의 사용은 성능 측정과 함께 사용 되어야 함

    4. 지역함수
        - 함수 안에 함수를 선언할 수 있다.
 */
fun main() {
    val str = "ASDFASDFASDF"
    println(str.lastChar())

    val person = Person("fad", "fff", 29)

    person.nextYearAge()

    val tempInt: Int = 3

    println(tempInt.add(4))
    println(tempInt.add2(4))
    println(tempInt add2 4) // 이런식으로도 사용가능


    println(tempInt.add3(4))

}

fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수 ㅋ")
    return this.age + 1
}

fun Int.add(other: Int): Int = this + other

infix fun Int.add2(other: Int): Int = this + other

inline fun Int.add3(other: Int): Int = this + other
