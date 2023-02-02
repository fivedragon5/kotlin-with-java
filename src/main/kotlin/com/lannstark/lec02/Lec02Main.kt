package com.lannstark.lec02

import java.lang.IllegalArgumentException

/*
    1. Kotlin에서의 null Check
    2. Safe Call과 Elvis 연산자
        Safe Class (?.)
            안전한 타입
        Elvis 연산자 (?:)
    3. 널 아님 단언 (!!)
        nullable type 이지만, 아무리 생각해도 null이 될 수 없는 경우
    4. 플랫폼 타입
        Kotlin에서 Java코드를 가져다 사용할 때
            null관련 라이브러리를 이해하기 때문에 체크해줘야함 ex)nullable

    Java


    Koltin
        1. null 이 들어갈 수 있는 부분에 대해서 에러 표시
            - 앞에서 null Check를 해주면 호출 가능
        2. Elvis 앞에 연산자가 null 일 경우 뒤에값이 호출

 */
fun main() {
    // 2. Safe Call

    var str: String? = "ABC"
    //println(str.length) // 불가능
    println(str?.length) // 가능

    str = null
    println(str)

    // Elvis 연산자
    var str2: String? = null
    println(str?.length ?: 0)

    startsWith("ABC")
    //startsWith(null)

    var person = Person("개발자")
    //@Nullable 이 붙어 있기 때문에 null이 들어갈 수 없기 때문에 error
    //startsWithTest(person.name)

}

// Safe Call, Elvis 연산자를 활용해서 변경해보기
fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null !!!")
    }
    return str.startsWith("A")
}

fun startWithB1(str: String?): Boolean {

    return str?.startsWith("A") ?: throw IllegalArgumentException("null check!!!")
}


fun startWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startWithB2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}
fun startWithB3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithTest(str: String): Boolean {
    return str.startsWith("A")
}
