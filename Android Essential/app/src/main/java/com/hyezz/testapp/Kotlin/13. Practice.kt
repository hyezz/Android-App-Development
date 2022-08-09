package com.hyezz.testapp.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number1 = array.get(0)
    println(number1)

    // Index 100 out of bounds for length 3
    //val number2 = array.get(100)  // 인덱스에 주의해야 한다
    //println(number2)

    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    // Index 100 out of bounds for length 3
    //array.set(100, 100)
    
    // Array 의 Bounds
    // - 처음 만들 때 결정된다

    // Array를 만드는 방법(3)
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('b', 'c')  // char -> '', string -> ""
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)

    // Array를 만드는 방법(4)
    var a5 = Array(10, { 0 })
    var a6 = Array(5, { 1;2;3;4;5 })
}