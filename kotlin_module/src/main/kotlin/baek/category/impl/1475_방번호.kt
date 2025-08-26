package com.lucas.baek.category.impl

import kotlin.text.iterator

/**
 * 1475_방번호.kt: 백준 1475_S5
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 27. 오전 2:22
 * @description:주어진 숫자를 숫자 판 (1-9) 몇개를 사용해야 만들 수 있는지.
 * 6은 9로, 9는 6 으로 사용가능
 */
fun main() {
    val br = System.`in`.bufferedReader()
    val numbers = br.readLine()
    br.close()

    var checkArr = IntArray(10)

    // 숫자가 몇번 나왔는지 체크
    for(ch in numbers) {
        val n = ch.digitToInt()
        checkArr[n] ++
    }

    // 6 이나 9 는 서로 바꿔쓸 수 있음 : 6과 9의 개수를 더해서 2로 나눈 몫 + 나머지
    // % 2 의 경우 홀수일때 하나 더 필요하기 때문
    val sixNineCount = checkArr[6] + checkArr[9]
    checkArr[6] = sixNineCount / 2 + sixNineCount % 2
    checkArr[9] = checkArr[6] // 어차피 최대값을 구하는것

    println(checkArr.maxOrNull() ?: 0)
}

fun 방번호() {
    val room = readln().toInt()
    val numbers = IntArray(10)

    room.toString().forEach {
        numbers[it.digitToInt()]++
    }

    var maxCount = 0
    for (i in 0..9) {
        if(i != 6 && i != 9) maxCount = maxOf(maxCount, numbers[i])
    }

    val sixOrNine = (numbers[6]) + (numbers[9] + 1) / 2
    println(maxOf(maxCount, sixOrNine))
}