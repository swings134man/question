package com.lucas.baek.category.impl

/**
 * 2576_홀수.kt: B3
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 7. 1. 오후 5:31
 * @description:
 */
fun main() {

    var sum = 0;
    var min = 1000000000;

    val arr = Array(7) { readln().toInt() }
        .forEach {
            if(it % 2 != 0) {
                sum += it
                if(it < min) min = it
            }
        }


    if(sum == 0) print(-1) else println("$sum\n$min")
}