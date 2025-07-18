package com.lucas.baek.category.impl

import java.util.Scanner

/**
 * 2744_대소문자변경.kt: B5
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 18. 오전 12:43
 * @description:
 */

fun main() = with(Scanner(System.`in`)) {
    // Scanner 를 사용하여 한줄에 입력을 받는 예제
    val input = nextLine()

    // 대소문자 변경
    val result = input.map {
        if (it.isLowerCase()) it.uppercaseChar() else it.lowercaseChar()
    }.joinToString("")

    println(result)
}