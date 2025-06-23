package src.baekCoding.before_basic;

import java.util.Scanner;

/**
 * 두 수의 최대 공약수를 구하고
 * 최대 공약수 갯수 만큼 (1) 을 출력하면 되는문제 ,,,,
 */
public class 최대공약수_1850 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long a = sc.nextLong();
        Long b = sc.nextLong();
        sc.close();

        Long gcd = gcd(a, b);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            sb.append(1);
        }
        System.out.println(sb);
    }

    static Long gcd(Long a, Long b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
