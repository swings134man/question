package src.programmers.solve;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 나머지한점 (모의고사 예제)
 * @name : 나머지한점
 * @date : 2022/12/12 4:58 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 나머지한점 {

    // Solution
    private static int[] solution(int[][] v) {
        int[] answer = new int[2];

        // x좌표 구하기
        if(v[0][0] == v[2][0]) {
            answer[0] = v[1][0];
        }else if (v[1][0] == v[2][0]){
            answer[0] = v[0][0];
        }else {
            answer[0] = v[2][0];
        }

        // y좌표
        if(v[0][1] == v[1][1]) {
            answer[1] = v[2][1];
        }else if (v[1][1] == v[2][1]) {
            answer[1] = v[0][1];
        }else {
            answer[1] = v[1][1];
        }

        return answer;
    }//sol

    public static void main(String[] args) {

        int[][] v = {{1,4},{3,4},{3,10}};

        System.out.println(Arrays.toString(solution(v)));
    }//main
}//class
