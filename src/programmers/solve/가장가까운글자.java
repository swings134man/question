package programmers.solve;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 가장 가까운 글자 lv1
 * @name : 가장가까운글자
 * @date : 2023/02/04 3:29 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 *  1. 맨 첫글자는 무조건 -1
 *  2. lastIndexOf 사용으로 검색 char 값이 앞에 있는지 있다면 가장 마지막 index는 몇번인지 return 받는다. (없다면 -1)
 *  3. x가 -1이면 answer[i] = -1;  아니면 ---> i(포인터의 위치) - x(lastIndex 위치) = 몇글자 앞인지 계산가능.
 ************/
public class 가장가까운글자 {

    private int[] solution(String s) {
        int[] answer = new int[s.length()];
        // 맨 첫글자는 무조건 -1
        answer[0] = -1;


        for (int i = 1; i < s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i, i + 1), i -1); // 한글자씩 마지막 char 값과 비교.

            if(x != -1) {
                answer[i] = i-x;
            }else {
                answer[i] = -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        가장가까운글자 s = new 가장가까운글자();
        String sparam = "banana";
        int[] solution = s.solution(sparam);
        System.out.println(Arrays.toString(solution));
    }
}
