package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

/*
   코틀린에서 예외를 다루는 방법

    1. try catch finally 구문
        - 문법적으론 완전히 동일
        - try 문 자체를 return 할 수 있음 Expression
    2. Check Exception, Unchecked Exception
        - Kotlin
            모든 예외는 Unchecked Exception
            Checked Exception과 Unchecked Exception을 구분하지 않는다.
            모두 Unchecked Exception 입니다.
    3. try with resources
        .use 로 대체
            inline 확장함수
 */
fun main() {
    println(parseIntOrThrow("123"))
    //println(parseIntOrThrow("하이"))

    readFile()
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 숫자가 아닙니다 : ${str}")
    }
}

fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}
