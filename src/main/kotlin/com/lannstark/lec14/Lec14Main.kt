package com.lannstark.lec14

/*
    코틀린에서 다양한 클래스를 다루는 방법

    1.Data 클래스
        - data class 클래스명
            equals, hashCode, toString을 만들어 줌

    2.Enum 클래스
        - 조금더 읽기 쉬운 코드(when)로 만들 수 있음
        - 컴파일러가 모든 타입을 알고 있어 다른타입에 대한 로직(else)을 작성할 필요가 없음
        - Enum에 변화가 있으면 알 수 있음

    3.Sealed Class, Sealed Interface
        - 상속이 가능하도록 추상클래스를 만드려는데 외부에서는 이 클랙스를 상속받지 못하게 할 경우
        - 컴파일 타임 때 하위 클래스의 타입을 모두 기억
        - 런타임때 클래스 타입이 추가될 수 없다.
        - 하위 클래스는 같은 패키지에 있어야 한다.
        - 클래스를 상속받을 수 있다.
        - 하위 클래스는 멀티 인스턴스가 가능하다.
        - Enum클래스 보다 유연하지만 하위 클래스를 제한

 */
fun main() {
    val person = PersonDto("fad", 444)
    val person2 = PersonDto("fad1", 44)

    println(person)
    println(person2)
    println(person2.equals(person))
    println(person.hashCode())
    println(person2.hashCode())

}

data class PersonDto(
    val name: String,
    val age: Int,
) {
}

enum class CountryKt(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US");
}

fun handleCountryKt(country: CountryKt) {
    when (country) {
        CountryKt.KOREA -> TODO()
        CountryKt.AMERICA -> TODO()
        //ELSE를 작성해줄 필요가 없음.
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
)
