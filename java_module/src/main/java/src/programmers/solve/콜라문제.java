package src.programmers.solve;

/************
 * @info : 프로그래머스 - 콜라문제 (lv1)
 * @name : 콜라문제
 * @date : 2023/02/26 6:11 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : // a = 마트에줘야하는 수, b = 마트가 주는 수, n = 갖고있는 갯수
 ************/
public class 콜라문제 {

    private int solution(int a, int b, int n) {
        int answer = 0;

        while (true){
            if(n < a) {
                break;
            }

            answer += (n/a) * b; // 총 받는 갯수

            // 현재 갖고있는것을 다시 계산.
            n = ((n/a)*b + (n%a));
        }

        return answer;
    }


    public static void main(String[] args) {
        콜라문제 so = new 콜라문제();
        int solution = so.solution(3, 1, 20);
        System.out.println("res=" + solution);

    }
}
