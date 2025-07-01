package com.lucas.baek.category.impl

import kotlin.math.roundToInt

/**
 * 2108_통계학.kt: S2
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 6. 30. 오후 6:46
 * @description:
 */
fun main() {
    val n = readln().toInt()
    val numbers = List(n) { readln().toInt() }

    // 산술평균
    val mean = numbers.average().roundToInt()

    // 중앙값
    val median = numbers.sorted()[n / 2]

    // 최빈값 - 가장 많이 등장하는 값
    val frequencyMap = numbers.groupingBy { it }.eachCount()
    val maxFrequency = frequencyMap.values.maxOrNull() ?: 0
    val modeValues = frequencyMap.filter { it.value == maxFrequency }.keys.sorted()
    val modeValue = if (modeValues.size > 1) modeValues[1] else modeValues[0]

    // 범위
    val range = numbers.maxOrNull()!! - numbers.minOrNull()!!

    println("$mean\n$median\n$modeValue\n$range")
}