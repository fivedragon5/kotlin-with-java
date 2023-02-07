package com.lannstark.lec18

import com.lannstark.lec17.FruitKt

/*
    코틀린에서 컬렉션을 함수형으로 다루는 방법

    1. 필터와 맵
        - filter / filterIndexed
            필터 한 값만 줌 / + 인덱스
        - map / mapIndexed
            특정값만 반환해줌 / + 인덱스
        - mapNotNull
            null이 아닌것만 골라서 가지고옴

    2. 다양한 컬렉션 처리 기능
        - all
            조건을 모두 만족하면 true : false
        - none
            조건을 모두 불만족하면 true : false
        - any
            조건을 하나라도 만족하면 true : false
        - count
            개수를 센다
        - sortedBy / sortedByDescending
            오름차순 정렬 / 내림차순
        - distinctBy
            변형된 값을 기준으로 중복을 제거
        - first / last
            첫번째 값을 가져온다 / 마지막 값을 가져온다 (무조건 null이 아니어야 함)
        - firstOrNull / lastOrNull
            첫번째 값 또는 null을 가져온다 / 마지막 값 또는 null을 가저온다

    3. List를 Map으로
        - groupBy
            이름을 기준으로 group됌
        - associateBy
            중복되지 않은 key를가지고 map 을 만들때

    4. 중첩된 컬렉션 처리
        - flatMap
        - flatten

 */

fun main() {
    val fruits = listOf(
        FruitData(1 , "사과", 1000, 1000),
        FruitData(2 , "사과", 1200, 1000),
        FruitData(3 , "사과", 1200, 1000),
        FruitData(4 , "사과", 1500, 1000),
        FruitData(5 , "바나나", 3000, 1000),
        FruitData(6 , "바나나", 3200, 1000),
        FruitData(7 , "바나나", 2500, 1000),
        FruitData(8 , "수박", 10000, 1000),
    )
}

private fun filterFruits(
    fruits: List<FruitData>, filter: (FruitData) -> Boolean
): List<FruitData> {
    return fruits.filter(filter)
}
