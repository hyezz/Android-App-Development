package com.hyezz.testapp.Kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3)
    a.add(7)
    println(a)
    a.add(0,100)
    println(a)
    a.set(0,200)
    println(a)
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    b.add(2)
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)
}