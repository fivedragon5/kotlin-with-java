package com.lannstark.lec10

/*

 */

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int, // override를 위해 open 키워드 사용
) {
    abstract fun move()
}