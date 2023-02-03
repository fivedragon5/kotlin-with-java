package com.lannstark.lec10

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable{

    private val wingCount: Int = 2
    override fun move() {
        println("퓅귄이 움직입니다 ~ 뀁")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}