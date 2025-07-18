package com.lucas.programmers.lv1

/**
 * 크기가작은부분문자열.kt: Lv1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 18. 오후 5:40
 * @description: 
 */

fun main() {
    val t = "500220839878"
    val p = "7"
    val res = solution_4(t,p)
    println(res)
}

fun solution_4(t: String, p: String): Int {
    val pLong = p.toLong()
    return (0 .. t.length - p.length).count() { t.substring(it, it + p.length).toLong() <= pLong }
}