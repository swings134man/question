package programmers.lv1;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 예산
 * @name : 예산
 * @date : 2023/08/15 7:35 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            if(budget < d[i]){
                break;
            }
            budget -= d[i];
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        예산 so = new 예산();
        int solution = so.solution(d, budget);
        System.out.println("solution = " + solution);
    }
}
