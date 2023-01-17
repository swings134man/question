package programmers;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 연속된 수의 합(Lv0)
 * @name : 연속된수의합
 * @date : 2023/01/18 1:13 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * - 등차수열의 합공식
 * - 항의 갯수 * (첫항 + 끝항) /2
 *
 * - (total - (등차수열 합공식) /num = 배열의 첫번째 값보다 -1 작은 수)
 ************/
public class 연속된수의합 {

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];

//        int middle = num * (num +1) / 2;
//        int start = (total - middle) / num;
//        for(int i=1; i<num +1; i++) {
//            answer[i-1] = i + start;
//        }

        // Refactoring
        int res = (total - (num * (num +1) / 2)) / num; // 원하는 시작값 -1
        for(int i=1; i<num+1; i++) {
            answer[i-1] = res+i; // 1+2(3), 2+2(4), 3+2(5)
        }


        return answer;
    }

    public static void main(String[] args) {
        int num  = 3;
        int total = 12;
        int[] solution = solution(num, total);
        System.out.println(Arrays.toString(solution));
    }
}
