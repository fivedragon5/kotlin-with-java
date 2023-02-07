package com.lannstark.lec15

/*
    코틀린에서 배열과 컬렉션을 다루는 방법

    1. 배열
        - 사실 배열은 잘 사용하지 않음
        - indices
        - withIndex
    2. 코틀렌에서의 Collection - List, Set, Map
        - 가변
            - 컬렉션에 element를 추가, 삭제할 수 있다.
        - 불변
            - 컬렉션에 element를 추가, 삭제 할 수 없다.
            - Reference Type인 Element의 필드는 바꿀 수 있다.

    3. 컬렉션의 null 가능성, java와 함께 사용하기
        - List<Int?>
            - 리스트에 null이 들어갈 수 있지만, 리스트는 절대 null일 수 없음
        - List<Int>?
            - 리스트에는 null이 들어갈 수 없지만, 리스트는 null일 수 있음
        - List<Int?>?
            - 리스트에 null이 들어갈 수 도 있고, 리스트가 null일 수도 있음

 */

fun main() {

    //1. 배열
    val array = arrayOf(100, 200)
    array.plus(300)

    println("1. 인덱스 =====")
    for (i in array.indices) {
        println("${i} : ${array[i]}")
    }

    println("2. 인덱스 + 값 ======")
    for ((idx, value) in array.withIndex()) {
        println("${idx} :: ${value}")
    }

    //2. 컬렉션
    val numbers = listOf(100, 200) // 100, 200이 들어 있기때문에 Int로 타입 추론이 가능하기 때문에 생략가능
    val emptyList = emptyList<Int>() //비어있는 리스트를 만들때는 타입을 명시해 주어야 함

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for((idx, value) in numbers.withIndex()) {
        println("${idx} : ${value}")
    }

    //가변 List
    val nums = mutableListOf(200, 300, 400)

    mutableSetOf(1,2,3)

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for((key, value) in oldMap.entries) {
        println("${key} : ${value}")
    }

}

private fun printNumbers(numbers: List<Int>) {

}
