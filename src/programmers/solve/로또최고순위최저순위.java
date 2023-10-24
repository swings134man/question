package programmers.solve;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 로또최고순위최저순위(Lv1)
 * @name : 로또최고순위최저순위
 * @date : 2023/02/27 1:16 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * - 주어진 lottos 배열중 0, 0 을 당첨번호와 매칭
 *
 * - 최고 순위와 - 최저 순위 (2개 번호는 일치해야함.)
 *
 * - [최고, 최저]
 *
 * ** TIP
 * - Stream의 경우 성능 저하 발생...
 * - if case 문으로 코드 작성 -> 가독성 저하 및 코드길이 길어짐.
 ************/
public class 로또최고순위최저순위 {

    /*
        최적 솔루션
        1. 0 의 갯수 카운트.
        2. 일치하는 숫자의 갯수 카운트.
        3. 최고 등수=7-max(일치하는 숫자 갯수), 최저 등수=7-min(일치하는 숫자 갯수).
        4. 만약 2개이상의 번호가 일치하지 않는다면 6등(낙점)
     */
    private int[] solution(int[] lottos, int[] win_nums) {
        int match = 0;
        int zero = 0;

        for (int element: lottos) {
            if(element == 0) {
                zero++;
            }else {
                // 비교
               for(int win : win_nums){
                    if(element == win) {
                        match++;
                        break;
                    }
               }//for2
            }//else
        }//for

        int min = match;
        int max = match + zero;

        /*
            몇등 할 수 있는지 calc
            - min() : 2개의 요소중 작은것을 선택.
            - (7 - max/min) 을 하게 되면 1~5등까지 계산 가능, 그것보다 작을시 6등이 되는 계산 방식임.
                - Ex) 7 - min(3) = 4등 (3개일치시)
                - Ex2) 7 - max(5) = 2등 (5개일치시)
         */
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};

        return answer;
    }

    /*
        2번쨰 솔루션
     */
    private int[] solution2 (int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int num1 = 0; // 0의 수
        int num2 = 0; // 일치하는 숫자 수

        // 0 갯수
        for (int res: lottos) {
            if(res == 0){
                num1++;
                continue;
            }
            for (int win: win_nums) {
                if(res == win) {
                    num2++;
                }
            }
        }//for

        answer[0] = calcGrade(num2 + num1);
        answer[1] = calcGrade(num2);

        return answer;
    }
        public int calcGrade(int n) {
            switch (n){
                case 6 :
                    return 1;
                case 5 :
                    return 2;
                case 4 :
                    return 3;
                case 3 :
                    return 4;
                case 2 :
                    return 5;
                default :
                    return 6;
            }
        }


    public static void main(String[] args) {
        로또최고순위최저순위 so = new 로또최고순위최저순위();
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,43,1,6,19};
        int[] solution = so.solution(lottos, win_nums);
        System.out.println(Arrays.toString(solution));
    }
}
