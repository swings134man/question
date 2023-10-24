package programmers.solve;

/************
 * @info : 프로그래머스 - 삼총사
 * @name : 삼총사
 * @date : 2023/03/04 2:01 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : 각 정수=1인의 고유 번호.
 *
 * - 3명의 정수 합이 0 이면 '삼총사'
 * --> 삼총사를 만들 수 있는 방법의 수 return
 ************/
public class 삼총사 {

    /**
     * 3중 for문 사용.
     * @param number(int[])
     * @return int
     */
    private int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length -2; i++) {
            for (int j = i+1; j < number.length -1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    /**
     * 3중 for 문을 사용하지 않는방법.
     * @param number(int[])
     * @return int
     */
    private int solution2(int[] number) {
        int answer = 0;

        int signal = 0;
        while(signal <= number.length -3) {
            for (int i = signal+1; i < number.length -1; i++) {
                for (int j = i+1; j < number.length; j++) {
                    if(number[signal] + number[i] + number[j] == 0) {
                        answer++;
                    }
                }
            }
            signal++;
        }
        return answer;
    }

    public static void main(String[] args) {
        삼총사 s = new 삼총사();

        int[] number = {-2, 3, 0, 2, -5}; // return 2
        int solution = s.solution2(number);
        System.out.println(solution);
    }
}
