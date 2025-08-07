package com.lucas.programmers.lv2

import java.util.LinkedList
import java.util.Queue

class 서버증설횟수 {

    fun solution(players: IntArray, m: Int, k: Int): Int {
        var answer: Int = 0

        val qu: Queue<Int> = LinkedList()

        for(i in 0 until 24) {

            val needServer = players[i] / m

            // 현재 가동중인 서버가 존재하고, 시간 만료라면
            while(qu.isNotEmpty() && qu.peek() <= i) {
                qu.poll()
            }

            // 현재 가동중 서버
            val currentSize = qu.size

            if(currentSize < needServer) {
                val addServer = needServer - currentSize
                answer += addServer

                repeat(addServer) {
                    qu.offer(i + k)
                }
            }
        }

        return answer
    }

}

fun main() {
    val arr = intArrayOf(0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5)
    val m = 3
    val k = 5
    println(서버증설횟수().solution(arr, m, k))
}