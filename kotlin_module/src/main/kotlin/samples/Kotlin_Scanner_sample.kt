package com.lucas.samples

import java.util.Scanner

/**
 * Kotlin_Scanner_sample.kt: 코틀린에서 Scanner 를 사용하는 예제
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 6. 23. 오후 4:02
 * @description:
 */
fun main() = with(Scanner(System.`in`)) {

    // Scanner 를 사용하여 한줄에 입력을 받는 예제
    val intA = nextInt()
    val stringB = next()
    println("$intA - $stringB")

    // 버퍼에 남아있는 개행문자 (\n) 를 처리하기 위해
    nextLine()

    // Scanner 를 사용하여 여러 줄 입력을 받는 예제
    val intB = nextLine().toInt()
    val stringC = nextLine()
    println("$intB - $stringC")

    // 한줄에 여러개 입력 받아서 처리하는 예제
    val (x, y) = nextLine().split(" ").map { it.toInt() }
    println("x: $x, y: $y")

}