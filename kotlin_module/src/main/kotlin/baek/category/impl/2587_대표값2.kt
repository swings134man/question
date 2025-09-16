package com.lucas.baek.category.impl

/**
 * 2587_대표값2.kt: B2
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 9. 16. 오전 2:15
 * @description: 
 */
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    var list = mutableListOf<Int>()

    repeat(5) {
        list.add(br.readLine().toInt())
    }
    br.close()

    list.sort()

    bw.write((list.sum() / list.size).toString())
    bw.newLine()
    bw.write(list[list.size / 2].toString())

    bw.flush()
    bw.close()
}

fun 대표값2() {
    val numbers = List(5) { readln().toInt() }.sorted()
    println(numbers.sum() / numbers.size)
    println(numbers[2])
}