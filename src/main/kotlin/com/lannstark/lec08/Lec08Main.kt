package com.lannstark.lec08

/*

    코틀린에서 함수를 다루는 방법
    1. 함수 선언 문법
        - 함수는 클래스 안, 파일 최상단, 한 파일안에 여러 함수들이 있을 수도 있음.
    2. default parameter
        - 파라미터에 기본 값을 바로 넣을 수 있다.
    3. named argument
        - 함수를 호출할때 매개변수의 이름을 통해 직접 지정가능
        - 지정하지 않는 매개변수일경우 기본값 용
        - build를 직접 만들지 않고 builder의 장점을 가지게 된다.
    4. 같은 타입에 여러 파라미터 받기 (가변인자)
        - vararg
        - 가변인자 함수를 배열과 함께 호출할 때는 스프레드 연산자(*) 사용

 */
fun main() {

    repeat("Path Kotiln", useNewLine = true)

    printAll("A", "B", "C")

    val array = arrayOf("B", "C", "D")
    printAll(*array)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b

//fun repeat(str: String) {
//    repeat(str, 3, true)
//}
//
//fun repeat(str: String, num: Int) {
//    repeat(str, num, true)
//}

//Int = 3, Boolean = true Default parameter
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) println("${str}")
        else print("$str")
    }
}

fun printNameGender(name: String, gender: String) {
    print(name)
    print(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}


