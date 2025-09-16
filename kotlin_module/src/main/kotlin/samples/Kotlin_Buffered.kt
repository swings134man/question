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



    // Test Samples
    // 주의점 bufferedWriter 의 경우 개행문자(\n) 을 사용하지 않으면 이어서 나옴
    while (true) {
        val strings = reader.readLine()

        if(strings == "exit") break

        bw2.write(strings) // 이어서 출력됨
    }
    bw2.flush()

    reader.close()
    br2.close()
    br3.close()
    bw2.close()
    writer.close()
}