package src.programmers.solve;

/************
 * @info : 프로그래머스 - 나머지가 1이 되는 수 찾기(Lv1)
 * @name : 나머지가1이되는수찾기
 * @date : 2023/02/25 6:02 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 나머지가1이되는수찾기 {

    // Refactor 전
    private int solution(int n) {
        int answer = 0;

        // x 구하기 - n을 나눴을 때 1
        int x = 0;
        for (int i = 1; i < n; i++) {
            if((n % i) == 1) {
                x = i;
                break;
            }
        }

        // x에서 1씩 --
        for (int i = x; i > 0 ; i--) {
            int num = n % i;
            if(num == 1) {
                answer = i;
            }else if(num != 1) {
                answer = x;
            }
        }
        return answer;
    }

    // Refactoring Ver.
    // 최소값부터 계산 하면 위의 코드처럼 2번 연산할 필요가 없다.
    // -> 바로 최솟값을 계산하기 때문
    private int solution2 (int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        나머지가1이되는수찾기 so = new 나머지가1이되는수찾기();
//        int solution = so.solution(12);
//        System.out.println("res : " + solution);

        int i = so.solution2(12);
        System.out.println("res : " + i);
    }
}
