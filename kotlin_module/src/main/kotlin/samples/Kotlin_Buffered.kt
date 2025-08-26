package com.lucas.samples

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader

/**
 * Kotlin_Buffered.kt: Kotlin BufferedReader, BufferedWriter 사용 예제
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 27. 오전 2:23
 */
fun main() {
    // BufferedReader 사용 예제 3가지 전부 가능
    val reader = System.`in`.bufferedReader()
    val br2 = BufferedReader(InputStreamReader(System.`in`))
    val br3 = BufferedReader(System.`in`.reader())

    // BufferedWriter 사용 예제
    val writer = System.out.bufferedWriter()
    val bw2 = BufferedWriter(System.out.writer())
}