package com.lannstark.lec12

/*
    코틀린에서 object 키워드를 다루는 방법
    1. static 함수와 변수
        - static 대신 companion object사용
            - static
                클래스가 인스턴스화 될 때 새로운 값이 복제되는 것이 아니라 정적으로 인스턴스끼리 값을 공유
            - companion object
                클래스와 동행하는 유일한 오브젝트, 하나의 객체로 간주 됌
                이름을 붙일 수도 있고, interface를 구현할 수 도 있다.
                - const
                    컴파일 시에 변수가 할당 된다, 기본 타입과 String에만 붙일 수 있음
    2. 싱글톤
        - 앞에 object를 붙여주면 됌
    3. 익명클래스
        특정 인터페이스나 클래스를 상속받은 구현체를 일회성으로 사용할 때 쓰는 클래스
        선언 방법 : object: 타입 이름

 */
fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    moveSomething(object: Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })

}

class Person private constructor(
    var name: String,
    var age: Int
) {
    //동행 객체
    companion object Factory : Log{

        //const : 컴파일 시에 변수가 할당된다
        //기본 타입과 String에만 붙일 수 있음
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person클래스의 동행 Factory입니다.")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(moveable: Movable) {
    moveable.move()
    moveable.fly()
}
