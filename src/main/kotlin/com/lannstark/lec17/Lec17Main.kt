package com.lannstark.lec17
/*
    코틀린에서 람다를 다루는 방법

    1. Java에서 람다를 다루기 위한 노력
        - Java
            - 람다
            - 스트림
            - 메소드 레퍼런스
        - 메소드 자체를 직접 넘겨주는 것처럼 쓸 수 있다.

    2. 코틀린에서의 람다
        - 코틀린에서는 함수가 그 자체로 값이 될 수 있다
        - 변수에 할당할수도, 파라미터로 넘길 수 도 있다.
        - 람다의 마지막 expression 결과는 람다의 반환 값이다.

    3. Closure
        - Java에서는 람다를 사용할때 사용할 수 있는 변수에 제약이 있음
        - Kotlin에서는 가능
            - 코틀린에서는 람다가 시작하는 지점에 참조하고 있는 변수들을
              모두 포획하여 그 정보를 가지고 있음
              이렇게 해야, 람다를 진정한 일급 시민으로 간주할 수 있다.
              이 데이터 구조를 Closure라고 부른다.
            - Closure를 사용하여 가변(non-final)변수도 람다에서 사용 할 수 있다.

    4. try with resources
        - .use
            public inline fun <T : Closeable?, R> T.use(block: (T) -> R): R {
                - T.use
                    - Closeable 구현체에 대한 확장함수이다.
                - inline 함수
                - block: (T) -> R
                    - 람다를 받게 만들어진 함수이다.


 */

fun main() {
    val fruits = listOf(
        FruitKt("사과", 1000),
        FruitKt("사과", 1200),
        FruitKt("사과", 1200),
        FruitKt("사과", 1500),
        FruitKt("바나나", 3000),
        FruitKt("바나나", 3200),
        FruitKt("바나나", 2500),
        FruitKt("수박", 10000),
    )

    //1. 람다를 만드는 방법 1
    val isApple = fun(fruit: FruitKt): Boolean {
        return fruit.name == "사과"
    }

    val isApple3: (FruitKt) -> Boolean = fun(fruit: FruitKt): Boolean {
        return fruit.name == "사과"
    }

    //2. 람다를 만드는 방법2
    val isApple2 = { fruit: FruitKt -> fruit.name == "사과" }

    //1. 람다를 호출하는 방법1 바로 호출
    isApple(fruits[0])
    //2. 람다를 호출하는 방법2 invoke
    isApple.invoke(fruits[0])


    //함수 자체를 받을 수 있다 (Kotiln에서는 함수가 1급 시민)
    println(filterFruits(fruits, isApple))
    // 중괄호를 밖으로 뺄 수 있음
    filterFruits(fruits) { fruit: FruitKt -> fruit.name == "사과" }
    //filterFruits에서 타입 추론 가능 하기때문에 FruitKt생략 가능
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    //이름 변경 가능
    filterFruits(fruits) { a -> a.name == "사과" }
    //람다 작성시 람다의 파라미터를 it으로 변경 가능
    filterFruits(fruits) { it.name == "사과" }

}

class FruitKt(
    val name: String,
    val price: Int,
)

private fun filterFruits
    (fruits: List<FruitKt>, filter: (FruitKt) -> Boolean
): List<FruitKt> {
    val results = mutableListOf<FruitKt>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}