package com.hyezz.testapp.Kotlin

fun main(array: Array<String>) {
    first()
    println(second(80))
    println(third(89))
    gugudan()

    firstAnswer()
    println(secondAnswer(80))
    println(thirdAnswer(89))
    gugudanAnswer()
}

// 1번 문제
// List를 두개 만든다
// 첫번째 ArrayList에는 0부터 9까지 값을 넣는다 (반복문 사용)
// 두번쨰 ArrayList에는 첫번째 ArrayList의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False를 넣어준다
fun first() {
    val numberList1 = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val numberList2 = mutableListOf<Boolean>()
    for (number in numberList1) {
        if (number % 2 == 0) {
            numberList2.add(true)
        } else {
            numberList2.add(false)
        }
    }
    println(numberList1)
    println(numberList2)
}

fun firstAnswer() {
    val list1 = MutableList(9, { 0 })
    val list2 = MutableList(9, { true })

    for (i in 0..8) {
        list1[i] = i + 1
    }
    println(list1)

    list1.forEachIndexed { index, value ->
        if (value % 2 == 0) list2[index] = true // 짝수
        else list2[index] = false // 홀수
    }
    println(list2)
}

// 2번 문제
// 학점을 구하자
// 80 - 90 -> A
// 70 - 79 -> B
// 60 - 69 -> C
// 나머지 F
fun second(score: Int) : String {
    when (score) {
        in 80..90 -> return "A"
        in 70..79 -> return "B"
        in 60..69 -> return "C"
        else -> return "F"
    }
}

fun secondAnswer(score: Int) : String {
    var result: String = "F"
    when (score) {
        in 90..100 -> result = "A"
        in 80..89 -> result = "B"
        in 70..79 -> result = "C"
        else -> result = "F"
    }
    return result
}

// 3번 문제
// 전달받은 숫자의 각 자리 숫자의 합을 구하자
// 조건 : 전달받은 숫자는 무조건 두자리 숫자이다
fun third(number: Int) : Int {
    var remainder = number / 10
    var quotient = number % 10
    return remainder + quotient
}

fun thirdAnswer(number: Int) : Int {
    var a: Int = number / 10
    var b: Int = number % 10
    return a + b
}

// 4번 문제
// 구구단을 출력하자
fun gugudan() {
    for (x in 1..9) {
        for (y in 1..9) {
            println("$x x $y = ${x * y}")
        }
    }
}

fun gugudanAnswer() {
    for (x in 1..9) {
        // 1 -> 2 -> ...
        for (y in 1..9) {
            // 1부터 9까지 반복 -> 1부터 9까지 반복 -> ...
            println("$x x $y = ${x * y}")
        }
    }
}