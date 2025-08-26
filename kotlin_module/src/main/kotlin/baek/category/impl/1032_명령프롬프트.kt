package com.lucas.baek.category.impl

/**
 * 1032_명령프롬프트.kt: B1
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 27. 오전 3:13
 * @description: 브루트포스, 구현
 * 애초에 하나만 틀려도 "?" 이니깐 escape 후 signal(bool) 에 따라서 Char 추가
 */
fun main() {
    val br = System.`in`.bufferedReader()
    val count = br.readLine().toInt()
    val list = mutableListOf<String>()
    var answer = ""

    repeat(count) {
        list.add(br.readLine())
    }
    br.close()

    val fileLength = list[0].length

    for (i in 0 until fileLength) {
        var isSame = true
        val lastString = list[0][i] // 비교할 첫 글자

        for (j in 0 until list.size) {
            val currentChar = list[j][i]

            if(lastString != currentChar) {
                isSame = false
                break
            }
        }

        if(isSame) answer += lastString
        else answer += "?"
    }
    println(answer)

}