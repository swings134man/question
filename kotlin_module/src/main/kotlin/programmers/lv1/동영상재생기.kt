package com.lucas.programmers.lv1

/**
 * 동영상재생기.kt: 프로그래머스 LV1
 *
 * @author: lucaskang(swings134man)
 * @since: 2025. 8. 23. 오전 1:49
 * @description: 10초 전, 앞 기능, 오프닝 건너뛰기
 * prev: 이전 10초로 이동,
 * next: 다음 10초로 이동,
 * 건너뛰기: op_start <= now <= op_end 이면 건너뛰기 -> 오프닝 끝나는 위치로
 * pos 부터 시작?
 */
class 동영상재생기 {
    fun solution(video_len: String, pos: String, op_start: String, op_end: String, commands: Array<String>): String {
        val startTime = stringToTimeArray(pos)

        // 초기화 (skip)
        skip(startTime, stringToTimeArray(op_start), stringToTimeArray(op_end))

        commands.forEach { it ->
            // Skip 이후 작업
            skip(startTime, stringToTimeArray(op_start), stringToTimeArray(op_end))

            if("next" == it){
                next(startTime)
            }else {
                prev(startTime)
            }

            isEnd(startTime, stringToTimeArray(video_len))
        }
        skip(startTime, stringToTimeArray(op_start), stringToTimeArray(op_end))


        val min = if(startTime[0] < 10) "0${startTime[0]}" else "${startTime[0]}"
        val sec = if(startTime[1] < 10) "0${startTime[1]}" else "${startTime[1]}"

        return "$min:$sec"
    }

    // String To Int Array
    fun stringToTimeArray(time: String): MutableList<Int> {
        val timeArr = time.split(":").map { it.toInt() }
        return timeArr as MutableList<Int>;
    }

    fun next(time: MutableList<Int>){
        var min = time[0]
        var sec = time[1]

        sec += 10

        if(sec >= 60) {
            sec -= 60
            min += 1
        }

        time[0] = min
        time[1] = sec
    }

    fun prev(time: MutableList<Int>){
        var min = time[0]
        var sec = time[1]

        sec -= 10

        // 00:00
        if (sec < 0) {
            sec += 60
            min -= 1
        }

        if(min < 0) {
            min = 0
            sec = 0
        }

        time[0] = min
        time[1] = sec
    }//prev

    fun skip(time: MutableList<Int>, op_start: MutableList<Int>, op_end: MutableList<Int>) {
        // 오프닝 시작 시간보다 크거나 같고, 오프닝 끝나는 시간보다 작거나 같으면 (현재 시간이 오프닝 시간대에 포함되는지 정확하게 확인 필요함)
        var now = time[0] * 60 + time[1]
        var start = op_start[0] * 60 + op_start[1]
        var end = op_end[0] * 60 + op_end[1]
        if(now in start..end) {
            // 오프닝 끝나는 시간으로 이동
            time[0] = op_end[0]
            time[1] = op_end[1]
        }
    }

    fun isEnd(time: MutableList<Int>, video_len: MutableList<Int>) {
        var now = time[0] * 60 + time[1]
        var end = video_len[0] * 60 + video_len[1]
        if(now >= end) {
            time[0] = video_len[0]
            time[1] = video_len[1]
        }
    }
}

fun main() {
    val obj = 동영상재생기()

    val video_len = "10:00"
    val pos = "00:08"
    val op_start = "00:00"
    val op_end = "00:05"
    val commands = arrayOf("prev")

    obj.solution(video_len, pos, op_start, op_end, commands).also { println(it) }
}