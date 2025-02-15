package baekCoding.category.impl;

import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 유진수_1356.java
 * @date : 2025. 2. 15. 오후 5:06
 * @author : lucaskang(swings134man)
 * @Description: B1 - 구현
 * - n 을 두개의 수로 나눔
 * - 나눈 앞의 수 각자리 곱셈, 뒷자리 수 각자리 곱셈 을 해서 같으면 YES
**/
public class 유진수_1356 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        String nString = String.valueOf(n);
        boolean result = false;

        for (int i = 1; i < nString.length(); i++) {
            int a = 1;
            int b = 1;

            for (int j = 0; j < i; j++) {
                a *= nString.charAt(j) - '0';
            }
            for (int j = i; j < nString.length(); j++) {
                b *= nString.charAt(j) - '0';
            }
            if(a == b) result = true;
        }

        System.out.println(result ? "YES" : "NO");
    }//main
}
