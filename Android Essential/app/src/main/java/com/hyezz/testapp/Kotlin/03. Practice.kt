package com.hyezz.testapp.Kotlin

var a = 1 + 2 + 3 + 4 + 5
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null
// - 존재하지 않는다

// Null can not be a value of a non-null type Int
//var abc : Int = null
var abc1 : Int? = null  // ? : null 가질 수 있음
var abc2 : Double? = null

var g = a + 3

fun main(args:Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)

    println(abc1)
    println(g)
}