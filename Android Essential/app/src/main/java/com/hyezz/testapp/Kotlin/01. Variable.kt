package com.hyezz.testapp.Kotlin

// 01. Variable -> 변수
// 값을 가지고 있는 상자
//      - 내 마음대로 원하는 것을 넣을 수 있는 상자 -> Variable(var)
//      - 한번 넣으면 바꿀 수 없는 상자 -> Value(val)

// 변수 선언하는 방법
// var/val 변수명(상자) = 값(넣고 싶은 것)

// Variable or Value ?
// - 1. 변하지 않는 값이라면 -> Value
// - 2. 어떻게 사용될지 모르겠으면 -> Value
//      (일단 Value로 선언했다가 나중에 사용할 때 Variable로 바꾸는 게 낫다)

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    // Val cannot be reassigned
    //fix = 500
}