package baekCoding.before_basic;

import java.util.Scanner;

/**
 * @package : baekCoding.before_basic
 * @name : 팩토리얼_27433_재귀.java
 * @date : 2024. 12. 29. 오전 1:42
 * @author : lucaskang(swings134man)
 * @Description: B5 - 재귀
**/
public class 팩토리얼_27433_재귀 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(fact(n));
    }

    private static long fact(int n) {
        return n == 0 || n == 1 ? 1 : n * fact(n - 1);
    }//fact
}
