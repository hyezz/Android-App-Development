package com.hyezz.testapp.Kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte
// 실수형 -> Double > Float
// 문자 -> Char
// 문자열 -> String
// 논리형(T/F) -> Boolean

var number = 10

// Type을 명시하지 않아도 스스로 판단한다.
var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

fun main(args:Array<String>) {
    number = 20

    // The floating-point literal does not conform to the expected type Int
    //number = 20.5
}