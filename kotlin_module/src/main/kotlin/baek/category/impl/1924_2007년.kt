package com.lucas.baek.category.impl

/**
 * 1924_2007년.kt: 백준 1924번 문제 "2007년" - B1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 6. 23. 오후 3:54
 * @description:
 */
fun main() {

    val (x, y) = readln().split(" ").map { it.toInt() }

    val month = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val day =  arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    val totalDays = month.take(x - 1).sum() + y

    println(day[totalDays % 7])
}