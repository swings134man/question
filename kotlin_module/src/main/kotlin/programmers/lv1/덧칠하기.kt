package com.lucas.programmers.lv1

/**
 * 덧칠하기.kt: 프로그래머스 LV1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 18. 오전 1:08
 * @description:
 */
fun main() {
    println(solution_덧칠하기(8, 4, intArrayOf(2, 3, 6)))
}

fun solution_덧칠하기(n: Int, m: Int, section: IntArray): Int {
    var answer: Int = 0

    var current = 0
    for (i in section) {
        if (current < i) {
            current = i + m - 1
            answer++
        }
    }

    return answer
}