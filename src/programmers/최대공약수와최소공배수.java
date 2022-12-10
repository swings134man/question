package programmers;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 최대공약수와 최소 공배수
 * @name : 최대공약수와최소공배수
 * @date : 2022/12/10 9:38 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * 1. 배열의 맨앞은 최대공약수
 * 2. 그다음은 최소공배수 반환
 ************/
public class 최대공약수와최소공배수 {

    // Solution 1번
    private static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = n;
        int b = m;

        // 최대공약수 - 재귀가 아닌 반복문 방식
        int max = 0;
        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        max = n;

        // 최소 공배수
        int min = (a*b) / max;

        answer[0] = max;
        answer[1] = min;

        return answer;
    }// Solution1


    // Refactoring
    private static int[] sol2(int n, int m) {
        int[] answer = new int[2];

        answer[0] = gcd(n, m);
        answer[1] = (n*m) / answer[0];

        return answer;
    }
            // 최대 공약수를 구하기 위한 재귀 메서드
            static int gcd(int n, int m) {
                if(m == 0) {
                    return n;
                }else {
                    return gcd(m, n % m);
                }
            }


    public static void main(String[] args) {
        // ex1
        // 예상 Return 값은 [3,12]
        int n = 3;
        int m = 12;

        //ex2
        // -> [1,10]
        int a = 2;
        int b = 5;

        System.out.println("솔루션 1번 : " + Arrays.toString(solution(n,m)));
        System.out.println("솔루션 2번 : " + Arrays.toString(sol2(a,b)));
    }
}//class
