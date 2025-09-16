package com.lucas.baek.category.impl

/**
 * 10808_알파벳갯수.kt: B4
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 9. 17. 오전 2:25
 * @description:
 */
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val s = br.readLine()
    br.close()

    val checkArr = Array(26) {0}

    s.forEach { it ->
        val num = it - 'a'
        checkArr[num] += 1
    }

    checkArr.forEach { it ->
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
//    알파벳갯수()
}

// 메모리: 22324kb, 140ms -> main: 12372, 72ms
fun 알파벳갯수 () {
    readln()
        .groupingBy { it - 'a' }
        .eachCount()
        .let { counts ->  // 4. 결과를 임시 변수로 받아서 처리
            (0..25).joinToString(" ") { (counts[it] ?: 0).toString() }
        }
        .let(::println)
}