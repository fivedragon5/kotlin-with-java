package com.lannstark.lec09

import java.lang.IllegalArgumentException

/*
    코틀린에서 클래스를 다루는 방법
    1. 클래스와 프로퍼티
        - 코틀린에서는 필드만 만들면 getter, setter를 자동으로 만들어 준다.
            - var, val 다름
    2. 생성자와 init
        - constructor 생략 가능
        - 클래스의 필드 선언과 생성자를 동시에 선언할 수 있다.
        - .field를 통해  getter, setter 사용 가능
        - Java Code에서 가져다 쓸 때도 .filed로 getter, setter를 대체 할 수 있음
        - init블록은 생성자가 호출되는 시점에 호출, validation 로직 응용 가능
        - constructor 추가 생성자
            - this가 위에있는 생성자를 가르킴
        - 생성자
            - 주 생성자(Primary constructor)
                 - 반드시 존재 해야함
                 - 단, 주 생성자에 파라미터가 하나도 없는 경우 생략 가능
            - 부 생성자(secondary constructor) / default
                - *최종적으로* 주 생성자를 this로 호출해야 함
                - body를 가질 수 있음
                    - 본문은 역순으로 실행 됌
                    초기화 블록
                    첫번째 부 생성자
                    두번쨰 부 생성자
            - Kotiln에서는 부 생성자 보다 default parameter, 정적 팩토리 메소드를 권장 한다.
    3. 커스텀 getter, setter
        - 실제 메모리에 존재하는 것과 무관하게 custom getter, custom setter를 만들 수 있다.
            - 함수처럼 만들 수 있고, 프로퍼티 처럼 만들 수 있음 (get())

    4. backing field
        - custom getter, setter을 사용할때 무한 루프가 발생할 수 있어 field를 사용
 */

fun main() {
    val kotlinPerson = KotlinPerson("fad", 10)
    println(kotlinPerson.name)
    kotlinPerson.age = 99
    println(kotlinPerson.age)

    val person = KotlinPerson("fad", 22)
    println(person.isAdult)
//    println(person.isAdult())


}

/*
   기본이 public이기 때문에 class앞에 public 생략 가능
*/
public class Person constructor(name: String, age: Int) {

    val name = name
    var age = age

}

class KotlinPerson(
    val name: String,
    var age: Int,
)


{

//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    val uppercaseName: String
        get() = this.name.uppercase()

    //검증
    init {
        if (age <= 0) throw IllegalArgumentException("나이 throw")
        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 부 생성자 ")
    }

    constructor(): this("path") {
        println("두번쨰 부 생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20

}

