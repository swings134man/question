package com.lucas.baek.category.impl

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

/**
 * 25305_커트라인.kt: B2
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 1. 오후 5:02
 * @description: 첫 풀이 - 메모리 사용량이 높음
 */
fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val numbers = readln().split(" ").map { it.toInt() }.sortedDescending().take(k).min()
    println(numbers)
}


/**
 * 25305_커트라인.kt:
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 1. 오후 5:19
 * @description: 메모리 최적화 - BufferedReader + StringTokenizer 사용 -> readln() 은 메모리 사용량이 높음
 */
fun subMain() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())

    val n = st.nextToken().toInt()
    val k = st.nextToken().toInt()

    st = StringTokenizer(readLine())
    val array = Array(n) {st.nextToken().toInt()}
    array.sort()

    println(array[n - k])
}