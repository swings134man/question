package com.lucas.programmers.lv1

/**
 * 유연근무제.kt: 프로그래머스 LV1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 22. 오후 9:38
 * @description: 상품을 받을 직원 수 return,
 * - 근무 시작 희망 시각: schedules
 * - 일주일 출근 시각 : timelogs
 * - 시작일: startday
 *
 * 1 월요일, 7 일요일
 * 주말은 지각해도 상관없음 6,7
 *
 * 문제는 시간계산임 -> 858 + 10 = 868 로 하게 되면, 실질적으로 908이지만, 900 이 기준시간이라면
 * 비교시 900 > 868 로 지각판단이 안되지만 시간계산 다시하면 -> 900 < 908 로 지각판단이 됨
 */
class 유연근무제 {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer: Int = 0

        // 시간표 기준으로 전체 돌리기
        timelogs.forEachIndexed { index, log ->
            val saveTime = caclTime(schedules[index])
            var isLate = false // 지각 여부

            var currentDay = startday
            log.forEach { time ->

                // 일요일 넘어가면 다시 월요일로
                if(currentDay > 7) currentDay = 1

                // 주말은 카운트 안함
                if(currentDay != 6 && currentDay != 7) {
                    if(time > saveTime) {
                        isLate = true
                        return@forEach
                    }
                }

                if(isLate) return@forEach

                currentDay++
            }

            if (isLate) return@forEachIndexed // 지각이면 다음 직원으로 넘어감
            else answer++
        }

        return answer
    }

    fun caclTime(time: Int): Int {
        var hour = time / 100
        var min = time % 100

        min += 10

        if(min >= 60) {
            hour += 1
            min -= 60
        }
        return hour * 100 + min
    }
}

fun main() {
    val startday = 5
    val schedules = intArrayOf(700, 800, 1100)
    val timelogs = arrayOf(
        intArrayOf(710, 2359, 1050, 700, 650, 631, 659),
        intArrayOf(800, 801, 805, 800, 759, 810, 809),
        intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100)
    )

    println(유연근무제().solution(schedules, timelogs, startday))
}