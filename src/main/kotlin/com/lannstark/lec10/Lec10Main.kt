package com.lannstark.lec10

/*
    코틀린에서 상속을 다루는 방법
    1. 추상 클래스
        - extends 키워드를 사용하지 않고 : 을 사용한다.
        - 상위 클래스의 생성자를 바로 호출한다.
        - override를 필수적으로 붙여줘야 함
        - 프로퍼티를 override를 할때 무조건 open을 붙여줘야 함
        - Java처럼 추상클래스는 인스턴스 화 할 수 없다.
    2. 인터페이스
        - : 사용
        - 중복되는 인터페이스를 특정할때는 super<타입>.함수를 사용한다.
        - backing field가 없는 프로퍼티를 interface에 만들 수 있다.
    3. 클래스를 상속할 때 주의할 점
        - 상위 클래스에서 하위 클래스가 override 하고 있는 프로퍼티를 생성자 블락이나 init 블락을
          쓰게 되면 이상한 값이 나갈 수 있기 때문에 상위 클래스를 설계할 때 생성자 또는 초기화 블록에
          사용되는 프로퍼티 에는 open을 피해야 한다.
    4. 상속 관련 지시어
        final: override를 할 수 없게 한다. default로 보이지 않게 존재한다.
        open: override를 열어 준다.
        abstract: 반드시 override 해야 한다
        override: 상위 타입을 오버라이드 하고 있다.
 */
fun main() {

}
