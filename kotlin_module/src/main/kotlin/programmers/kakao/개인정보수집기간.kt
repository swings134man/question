package com.lucas.programmers.kakao

import kotlin.collections.set

/**
 * 개인정보수집기간.kt: LV1 카카오 프로그래머스
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 9. 3. 오후 11:17
 * @description: 각 날짜를 정수로 변환
 * (1년 = 12달, 1달 = 28일)
 * 1. 오늘 날짜를 정수로 변환
 * 2. 약관 종류별 유효기간을 map에 저장
 * 3. 각 개인정보 수집 날짜를 정수로 변환 후 유효기간을 더해서 오늘 날짜와 비교
 * -> 오늘 날짜보다 작거나 같으면 파기대상 => 작거나 같으면 파기날짜가 오늘이거나 지난 걸로 판단
 */
class 개인정보수집기간 {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()

        // 오늘 날짜 정수
        val todayInt = getDate(today)
        println("todayInt = $todayInt")

        val termMap = mutableMapOf<Char, Int>()
        terms.forEach {
            val (type, period) = it.split(" ")
            termMap[type[0]] = period.toInt()
        }

        privacies.forEach {
            val (date, type) = it.split(" ")

            val start = getDate(date) + (termMap.getValue(type[0])) * 28
            println("start = $start")
            if(start <= todayInt) {
                answer = answer.plus(privacies.indexOf(it) + 1)
            }
        }


        return answer
    }

    fun getDate(date: String): Int {
        val (y, m, d) = date.split(".").map { it.toInt() }
        return (y * 12 * 28) + (m * 28) + d
    }
}

fun main() {
    val today = "2022.05.19"
    val terms = arrayOf("A 6", "B 12", "C 3")
    val privacies = arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")

    val result = 개인정보수집기간().solution(today, terms, privacies)
    println(result.joinToString(", "))
}