package com.lannstark.lec05

import java.lang.IllegalArgumentException

/*
    1. if
        - 같음
        But if-else

    2. Expression Statement
         - Kotlin
            Expression : 하나의 값으로 도출되는 문장
         - Java
            Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다.
    3. switch when
        switch -> when
 */

fun main() {
    //vaildateScoreIsNotNegative(-1)
    println(getPassOrFail(55))
    println(getPassOrFail2(55))
    println(getGrade(85))
}

//함수에서 Unit 생략
fun vaildateScoreIsNotNegative(score: Int): Unit {
    if (score < 0) {
        throw IllegalArgumentException("${score}는 0보다 작을 수 없다.")
    }
}

fun getPassOrFail(score: Int): String {
    //if에 밑줄이 처저 있는 이유 return을 앞에 붙여 중복되는 return 없앨 수 없음
    if (score >= 50) return "P"
    else return "F"
}

fun getPassOrFail2(score: Int): String {
    return if (score >= 50) "P"
    else "F"
}
fun getPassOrFail3(score: Int): String =
    if (score >= 50) "P"
    else "F"

// expression
fun getGrade(score: Int): String {
    return if (score >= 90) "A"
    else if (score >= 80) "B"
    else "D"
}
fun getGrade2(score: Int): String {
    return if (score in 80..90) "A"
    else "F"
}

fun getGradeSwitch(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
     return when (obj) {
         is String -> obj.startsWith("A")
         else -> false
     }
}

fun judgeNumber(number: Int): String {
    return when (number) {
        1, 0, -1 -> "숫자숫"
        else -> "-1, 0, 1 이 아님"
    }
}

fun judgeNumber2(number: Int): String { return "a"}

