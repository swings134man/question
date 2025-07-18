package com.lucas.programmers.lv1

fun main() {
    println(solution_문자열나누기("banana"))
}

fun solution_문자열나누기(s: String): Int {
    var result = 0

    var str = s

    while (str.isNotEmpty()) {
        var same = 1
        var diff = 0

        for (i in 1 until str.length) {
            if(str.elementAt(0) == str.elementAt(i)) same ++
            else diff++

            if (same == diff) break
        }

        str = str.substring(same + diff)
        result++
    }

    return result
}