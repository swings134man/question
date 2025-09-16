package com.lucas.baek.category.impl


/**
 * 9506_약수들의합.kt: B1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 9. 17. 오전 2:53
 * @description:
 */
fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    while (true) {
        val sb = StringBuilder()
        val n = br.readLine().toInt()
        var sum = 0

        if(n == -1) break

        for(i in 1 until n) {
            if(n % i == 0) {
                sb.append("$i + ")
                sum += i
            }
        }

        if(sum == n) {
            bw.write("$n = ${sb.toString().substring(0, sb.length - 3)}\n")
        }else {
            bw.write("$n is NOT perfect.\n")
        }
        bw.flush()
    }
    br.close()
    bw.close()
}