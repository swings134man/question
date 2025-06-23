package src.baekCoding.category.time_complex;

import java.util.Scanner;

/**
 * Parameter
     * a1, a0
     * c
     * n0
 *
 * 계산식
 * f(n) =
 * - a1n + a0
 * - g(n) = n
 * - c = 8
 * - n0 = n0
 * 일때!
 *
 * f(n) = a1n + a0
 * g(n) = n  ----------> O(g(n)) 을 O(n) 으로 표기해놨다(문제에)
 *
 * ------------------------------------------------------
 * f(n) <= c * n
 *  => a1n + a0 <= c * n
 *  => (c - a1)n > a0
 *
 * 즉? f(n) <= g(n) 이여야 된다?
 */
public class 알고리즘_점근적표기1_24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        sc.close();

        // c * n0 는 -------> c *g(n) 이 f(n) 보다 커야 해서 나옴
        // f(n) = a1*n + a0 이기에
        // 기본 수식은 a1*n0+a0 <= c*n0 이것인거고
        // a1 <= c ----- 수식이 나온 이유는 a0 가 음수일 경우? a1*n0+a0 이 c*n0 보다 작아질 수 있기 때문
        // ---> a1= 4, a0= -2, c=2, n=2 일때
        // ------> 4*2 - 2 <= 4 : false 이기 때문에 성립하지않음, 즉 a1 <= c 일 경우를 생각해야 하기 때문이다.
        // 되는거
        // a1=4, a0=-2, c=2, n=1 일때는
        // 4*1 -2 <= 2*1 이기에 성립한다.
        if((a1*n0 + a0) <= c*n0 && a1 <= c){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
