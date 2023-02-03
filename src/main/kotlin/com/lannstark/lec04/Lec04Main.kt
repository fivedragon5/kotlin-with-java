package com.lannstark.lec04

import com.lannstark.lec03.printAgeIfPerson2

/*
    코틀린에서 연산자를 다루는 방법
    1. 단항 연산자 / 산술 연산자 Java 와 동일 ( ++, -- ~~~ += 등등)
    2. 비교 연산자와 동등성, 동일성
        자바와 다르게 객체를 비교할때 비교 연산자를 사용하면 자동으로 compareTo를 호출해줌
        동등성 (==)
            두 객체의 값이 같은가
        동일성 (===)
            완전히 동일한 객체인가 = 주소 값이 같은가
    3. 논리 연산자 / 코틀린에 있는 특이한 연산자
        Java에는 없음
        in / !in
            컬렉션이나 범위에 포함되어 있다, 포함되어 있지 않다.
        a..b
            a ~ b 까지 범위
        a[i]
            a에서 특정 index i로 값을 가져온다
        a[i] = b
            a의 특정 index i에 b를 넣는다.
    4. 연산자 오버로딩
        Kotlin에서는 객체마다 연산자를 직접 지정할 수 있음
 */

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(2_000L)

    println(money1 == money2) //간전접으로 equals 호출
    println(money1 == money3)

    println(money1 === money2)
    println(money1 === money3)

    //Lazy연산

    if (fun1() || fun2()) {
        println("본문")
    }

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}
fun fun2(): Boolean {
    println("fun 2")
    return false
}
