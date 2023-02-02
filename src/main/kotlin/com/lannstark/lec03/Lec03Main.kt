package com.lannstark.lec03

/*
    코틀린에서 Type을 다루는 방법
    1. 기본 타입
    2. 타입 캐스팅
    3. Kotlin의 3가지 특이한 타입
        Any
            -Java의 Object역할 (모든 객체의 최상위 타입)
            -모든 Primitive Type의 최상위 타입도 Any이다
            -Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면, Any로 표현
            -equals, hashCode, toString 존재
        Unit
            -자바의 void와 동일한 역할
            -void와 다르게 Unit은 그자체로 타입 인자로 사용 가능
            -함수형 프로그래밍에서 unit은 단 하나의 인스턴스만 갖는 타입을 의미
             즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
        Nothing
            -함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
            -무조건 예외를 반환하는 함수

    4. String Interpolation, String indexing
        String Interpolation
            println("이름 : ${person.name} / 나이 : ${person.age}")
        String indexing
            val temp = "abcd"
            println(temp[2])
    Java
        1.기본 타입 간의 변환은 암시적으로 이루어 질 수 있다
        2. instanceof / (Person)

    Kotiln
        1.기본 타입 간의 변환은 명시적으로 이루어져야 한다. // nullable 에 대해서는 적절한 처리가 필요
        2. is / as Person (생략 가능) = 스마트 캐스팅
 */

fun main() {
    val number1 = 3
    var number2: Long = number1.toLong()

    //null에 대해서는 처리 필요
    val num1: Int? = 3
    val num2: Long = num1?.toLong() ?: 0L

    printAgeIfPerson2(Person("ttt", 11))
    val person = Person("fad", 2222)

    println("이름 : ${person.name} / 나이 : ${person.age}")

    var name = "fad"
    println("이름 : $name")

    var aaa = """
        asda
        ABC
        EFGGGG
    """.trimIndent()

    println(aaa)

    val temp = "abcd"
    println(temp[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        // 생략가능
        val person = obj as Person
        // obj.age
        println(person.age)
    }
    // 반대도 사용 가능
    if (obj !is Person) {
        // 생략가능
        val person = obj as Person
        // obj.age
        println(person.age)
    }
}


fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}

