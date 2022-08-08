package com.hyezz.testapp.Kotlin

fun main(array: Array<String>) {
    // 엘비스 연산자
    // - null 대응
    val number1: Int? = null
    val number2 = number1 ?: 10
    println(number2)

    // 값을 리턴하는 if
    val num1: Int = 10
    val num2: Int = 20

    val max = if (num1 > num2) {
        num1
    } else if (num1 == num2) {
        num2
    } else {
        100
    }
}