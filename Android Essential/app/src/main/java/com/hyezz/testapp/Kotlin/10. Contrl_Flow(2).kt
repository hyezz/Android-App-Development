package com.hyezz.testapp.Kotlin

// 10 제어흐름

// When

fun main(args: Array<String>) {
    val value1: Int = 3

    when (value1) {
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("I do not know value")
    }

    val value2 = when (value1) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}