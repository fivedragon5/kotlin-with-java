package com.lannstark.lec11

/*
    코틀린에서 접근 제어를 다루는 방법
    1. 자바와 코틀린의 가시성 제어
        - public
            동일
        - protected
            선언된 클래스 또는 하위 클래스 에서만 접근 가능
        - internal
            같은 모듈에서만 접근가능 (한번에 컴파일 되는 Kotlin코드)
        - private
            선언된 클래스 내에서만 접근 가능
        기본 접근 지시어는 public
    2. 코틀린 파일의 접근제어
        - public
            어디서든 접근 가능
        - protected
            파일 최상단 에는 사용 불가능
        - internal
            같은 모듈에서만 접근 가능
        - private
            같은 파일 내에서만 접근 가능
    3. 다양한 구성요소의 접근제어
        생성자
            생성자도 가시성 범위는 동일
            생성자에 접근 지시자를 붙이려면 constructor를 붙여줘야 한다.
            프로퍼티의 custom setter에 접근 지시어를 붙일 수 있다.
    4. java와 kotlin를 같이 사용할때 주의 할점
        - Internal은 바이트코드상 public 이 된다.
          때문에 Java코드에선 Kotlin모듈의 internal코드를 가져올 수 있다.
        - Kotlin의 protected와 Java에서의 protected 가 다르다.
 */

val a = 3

fun add(a: Int, b: Int): Int {
    return 1
}
fun main() {
    println(StringUtilsKt.isDirectoryPath("asdsdsd/w/2/321"))

    println(StringUtilsKt.isDirectoryPath("asdsdsd/w/2/"))
}

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}
