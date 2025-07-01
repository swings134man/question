package com.lucas.baek.category.impl

/**
 * 2167_2차원배열합.kt: S5
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 1. 오후 6:30
 * @description:
 */
fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = Array(n){ Array(m) {0} }

    repeat(n) {
        val line = readln().split(" ").map { it.toInt() }
        line.forEachIndexed { index, i -> arr[it][index] = i } // i=각원소, it=행(n)
    }

    val k = readln().toInt()
    repeat(k) {
        val (i, j, x, y) = readln().split(" ").map { it.toInt() -1 }
        var sum = 0
        for (index in i..x) {
            for (index1 in j..y) {
                sum += arr[index][index1]
            }
        }
        println(sum)
    }
}