package programmers.solve;

/************
 * @info : 프로그래머스 - 푸드파이트 대회
 * @name : 푸드파이트대회
 * @date : 2023/03/08 2:10 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 푸드파이트대회 {

    private String solution(int[] food) {
        String answer = "";
        StringBuffer sb = new StringBuffer();

        String left = "";

        for (int i = 1; i < food.length; i++) {
            if(food[i] != 0){ // 음식이 0이 아닐떄.
                for (int j = 0; j < food[i] / 2; j++) { // 짝수로 떨어져야함.
                    left += Integer.toString(i);
                }
            }
        }

        answer += left;
        sb.append(answer);

        StringBuffer reverse = sb.reverse(); // 뒤집기.
        answer += "0" + reverse;

        return answer;
    }

    public static void main(String[] args) {
        푸드파이트대회 so = new 푸드파이트대회();
        int[] food = {1,7,1,2};
        String solution = so.solution(food);
        System.out.println("answer= " + solution);
    }
}
