package com.lucas.programmers.lv1.이동문제

import kotlin.collections.forEach

/**
 * 공원산책.kt: Lv1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 18. 오후 6:13
 * @description:
 */
fun main() {
    println(solution5(arrayOf("SOO","OOO","OOO"), arrayOf("E 2","S 2","W 1")).contentToString())
}

fun solution5(park: Array<String>, routes: Array<String>): IntArray {
    // Y, X
    val dir = mapOf("E" to (0 to 1),
        "W" to (0 to -1),
        "S" to (1 to 0),
        "N" to (-1 to 0)
    )

    // S의 위치 (출발위치)
    var ty = park.indexOfFirst { it.contains("S") }
    var tx = park[ty].indexOf("S")


    // routes 만큼만 반복
    routes.forEach {
        val action = it.split(" ") // List<String> [E, 2]

        var nx = tx
        var ny = ty

        // 이동할 칸만큼 반복 (내부적으로는 1칸식만 움직임)
        for (i in 0 until action.last().toInt()) {
            ny += dir[action.first()]!!.first
            nx += dir[action.first()]!!.second

            if(checkRange(nx, ny, park.size, park[0].length).not()) break
            if(park[ny][nx] == 'X') break
        }

        if(checkRange(nx, ny, park.size, park[0].length) && park[ny][nx] != 'X') {
            tx = nx
            ty = ny
        }
    }

    return intArrayOf(ty,tx)
}

fun checkRange(x: Int, y: Int, height: Int, length: Int) =
    0 <= x && 0 <= y && x < length && y < height


