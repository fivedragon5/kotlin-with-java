package com.lannstark.lec19

import com.lannstark.lec18.FruitData
import com.lannstark.lec19.a.printHelloWorld as printHelloWorldA
import com.lannstark.lec19.b.printHelloWorld as printHelloWorldB

/*
    코틀린의 이모저모

    1. Type Alias와 as import
        - Type Alias
            - 긴 이름의 클래스 혹은 함수 타입이 있을때 축약하거나 더 좋은 이름을 쓰고 싶을때 사용 가능
        - as import
            - 다른 패키지의 같은 이름 함수를 동시에 가져오고 싶을경우 사용
            - 어떤 클래스나 함수를 임포트 할 때 이름을 바꾸는 기능

    2. 구조분해와 componentN 함수
        - 구조분해
            복합적인 값을 분해하여 여러 변수를 한번에 초기화 하는것을 말함, componentN문법을 호출하는 것임
        - componentN
            data class 가 자동으로 만들어줌
            프로퍼티를 가져오는것 (순서 중요)

    3. Jump와 Label
        - 코드의 흐름제어
            - return
            - break
            - continue
        - forEach문에서는 break, continue를 같이 사용 할 수 없다.
            - run 블럭에 return@run과 같이 사용 가능, return@forEach 등등
        - Label
            특정 expression에 라벨이름@ 을 붙여 하나의 라벨로 간주하고 break, continue, return등을 사용하는 기능

    4. TakeIf와 TakeUnless
        - takeIf
            - 주어진 조건을 만족하면 그 값이, 그렇지 않으면 null이 반환된다.
        - takeUnless
            - 주어진 조건을 만족하지 않으면 그 값이, 그렇지 않으면 null이 반환된다.
 */
fun main() {
    printHelloWorldA()
    printHelloWorldB()

    val person = PersonTest("fad", 77)
    val (name, age) = person
    println("${name} : ${age}")

    val name1 = person.component1()
    val name2 = person.component2()
}

private fun filterFruitsAlias(
    fruits: List<FruitData>, filter: FruitFilterAlias
): List<FruitData> {
    return fruits.filter(filter)
}

typealias FruitFilterAlias = (FruitData) -> Boolean

data class PersonTest(
    val name: String,
    val age: Int,
)