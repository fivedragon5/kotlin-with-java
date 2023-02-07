package com.lannstark.lec20

import com.lannstark.lec14.PersonDto

/*
    코틀린에 scope function

    1. scope function이란?
        - 람다를 사용해 일시적인 영역을 만들고 코드를 더 간결하게 만들거나, method chain에 활용하는 함수

    2. scope function의 분류
        - let, run, also, apply, with

    3. 언제 어떤 scope function을 사용해야할까?
        - let
            하나 이상의 함수를 call chain 결과로 호출 할 때
            non-null 값에 대해서만 code block을 실행시킬 때
            일회성으로 제한된 영역에 지역 변수를 만들 때
        - run
            객체 초기화와 반환 값의 계산을 동시에 해야 할때
            반복되는 생성 후처리는 생성자, 프로퍼티, init block으로 넣는 것이 좋다.
        - apply
            객체 그 자체가 반환
            객체 설정을 할 때에 객체를 수정하는 로직이 call chain 중간에 필요할 때
        - also
            객체를 수정하는 로직이 call chain 중간에
        - with
            특정 객체를 다른 객체로 변환해야 하는데, 모듈 간의 의존성에 의해 정적 팩토리 혹은 toClass 함수를 만들기 어려울 때

    4. scope function과 가독성

 */

fun main() {

}

fun printPerson(person: PersonDto) {
    person?.let {
        println(it.name)
        println(it.age)
    }

    if (person != null) {
        println(person.name)
        println(person.age)
    }
}