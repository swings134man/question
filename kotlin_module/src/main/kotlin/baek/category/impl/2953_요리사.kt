package com.lucas.baek.category.impl

/**
 * 2953_요리사.kt: B3
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 6. 30. 오후 6:34
 * @description: 백준 B3 나는 요리사다
 */
fun main(args: Array<String>) {
    // 각 참가자별 점수 저장 배열
    val scores = IntArray(5) { readln().split(" ").sumOf { it.toInt() }}
    println("${scores.indexOf(scores.max()) + 1} ${scores.max()}")
}