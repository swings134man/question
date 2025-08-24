package com.lucas.programmers.lv1

/**
 * 택배상자담기.kt: 프로그래머스 LV1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 24. 오후 4:03
 * @description: w=한 변의 길이, n=상자의 개수, num=꺼내야될 상자 번호
 *
 */
class 택배상자담기 {
    fun solution(n: Int, w: Int, num: Int): Int {
        var answer: Int = 0

        // 2차원 배열: length = n / w + (n % w == 0 ? 0 : 1), height = w
        var arr = Array(n / w + if (n % w == 0) 0 else 1) { IntArray(w) { 0 } }

        var isLeft = true
        var tarx = 0
        var tary = 0
        var colCount = 1

        for (i in 1 .. arr.size) {
            var rowCount = arr.size - i //(맨끝부터)

            if(rowCount < 0) break

            if(isLeft) {
                for (j in 0 .. w -1) {
                    if(colCount > n) break
                    if(colCount == num) {
                        tarx = rowCount
                        tary = j
                    }
                    arr[rowCount][j] = colCount++
                }
            }else {
                for (j in w -1 downTo 0) {
                    if(colCount > n) break
                    if(colCount == num) {
                        tarx = rowCount
                        tary = j
                    }
                    arr[rowCount][j] = colCount++
                }
            }
            isLeft = !isLeft
        }

        for (i in tarx downTo 0) {
            if(arr[i][tary] != 0) answer++
        }

        return answer
    }
}

fun main() {

    val s = 택배상자담기()
    val n = 13
    val w = 3
    val num = 6
    println(s.solution(n, w, num)) // 4
}