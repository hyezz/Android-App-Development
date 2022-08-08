package com.hyezz.testapp.Kotlin

// 08. 제어 흐름
// - if, else

fun main(array: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    // 값을 리턴하는 if 사용방법
    val max1 = if(a > b) {
        a
    } else {
        b
    }
    println(max1)

    val max2 = if (a > b) a else b
    println(max2)
}