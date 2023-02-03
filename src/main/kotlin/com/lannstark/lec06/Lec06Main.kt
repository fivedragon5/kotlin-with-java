package com.lannstark.lec06

/*
    코틀린에서 반복문을 다루는 방법

    for-each문

    전통적인 for

    Progression과 Range
        - 등차수열
            - .. range
    while

    1. in사용
    2. 등차수열과 in을 사용한다.
 */
fun main() {
    for (i in 1..5 step 3) {
        println(i)
    }

    for (i in 3 downTo 1) {
        println(i)
    }

    for (i in 1 until 2 ) {
        println(i)
    }
}
