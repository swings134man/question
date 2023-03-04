package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/************
 * @info : 프로그래머스 - 카드뭉치
 * @name : 카드뭉치
 * @date : 2023/03/05 12:52 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 카드뭉치 {

    /**
     * 1번 풀이
     * @param cards1
     * @param cards2
     * @param goal
     * @return answer
     */
    private String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        // 결과에 따라 answer 를 정의해야함.

        // card덱의 index
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < goal.length; i++) {

            // c1 - card1 : card1의 길이만큼 순회
            if(cards1.length > c1 && cards1[c1].equals(goal[i])) {
                c1++;
            }else if(cards2.length > c2 && cards2[c2].equals(goal[i])) {
                c2++;
            }else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }

    /**
     * 2번 풀이
     * @param cards1
     * @param cards2
     * @param goal
     * @return answer
     */
    private String solution2(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> q1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> q2 = new LinkedList<>(Arrays.asList(cards2));

        for (String word: goal) {
            if(q1.size()!=0 && q1.peek().equals(word)) { // q1의 사이즈가 0이면 pass, && q1의 first word와, goal의 단어가 일치한다면. q1에서 꺼내고 계속 진행.
                q1.poll();
                continue;
            }else if (q2.size()!=0 && q2.peek().equals(word)) {
                q2.poll();
                continue;
            }else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        카드뭉치 so = new 카드뭉치();
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        // res = Yes
        String solution = so.solution2(card1, card2, goal);
        System.out.println("res = " + solution);
    }
}
