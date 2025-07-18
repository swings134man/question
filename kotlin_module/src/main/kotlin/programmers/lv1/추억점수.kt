package com.lucas.programmers.lv1

/**
 * 추억점수.kt: 프로그래머스 LV1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 18. 오전 12:48
 * @description:
 */

fun main() {
    var name = arrayOf("may", "kein", "kain", "radi")
    var yearning = intArrayOf(5, 10, 1, 3)
    var photo = arrayOf(
        arrayOf("may", "kein", "kain", "radi"),
        arrayOf("may", "kein", "brin", "deny"),
        arrayOf("kon", "kain", "may", "coni")
    )

    println(solution_추억(name, yearning, photo).contentToString())
    println(refactoring_추억(name, yearning, photo).contentToString())
}


fun solution_추억(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    var answer: IntArray = intArrayOf()

    photo.forEach {
        var score = 0

        it.forEach {
            val index = name.indexOf(it)
            if(index != -1) score += yearning[index]
        }
        answer += score
    }

    return answer
}

fun refactoring_추억(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
    val scoreMap = name.zip(yearning.toList()).toMap()
    return photo.map { p ->
        p.sumOf { scoreMap[it] ?: 0 }
    }.toIntArray()
}