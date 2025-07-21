package com.lucas.programmers.lv1.이동문제_시뮬

/**
 * 점프와순간이동.kt: LV1 코틀린 전용 없음
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 21. 오후 5:57
 * @description: 2칸 이동시 배터리 소모 없음, 1칸이동시 배터리 소모 1
 * 이동시 최솟값
 */
fun main() {
    val n = 5
    println(solution6(n))
}

fun solution6(n: Int): Int {
    var answer = 0
    var n1 = n

    while (n1 > 0) {
        if(n1 % 2 == 0) {
            n1 /= 2
        }else {
            n1 --
            answer++
        }
    }

    return answer
}

