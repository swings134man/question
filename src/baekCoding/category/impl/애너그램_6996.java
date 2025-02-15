package baekCoding.category.impl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 애너그램_6996.java
 * @date : 2025. 2. 15. 오후 4:56
 * @author : lucaskang(swings134man)
 * @Description: B1 - 구현
 * - 단어 A,B 존재시, A 에 속하는 알파벳 순서 바꿔 B 가 되면 애너그램임
 * - 즉 B 의 모든 char 를 비교해서 동일한지 보면된다.
**/
public class 애너그램_6996 {
    // 풀이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            char[] aArr = a.toCharArray();
            char[] bArr = b.toCharArray();

            Arrays.sort(aArr);
            Arrays.sort(bArr);

            if(Arrays.equals(aArr, bArr)) {
                System.out.println(a + " & " + b + " are anagrams.");
            }else {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            }
        }
        sc.close();
    }//main

    // 풀이형식이 정해져있음
    private static boolean solveAnagrams(String first, String second ) {
        /* ------------------- INSERT CODE HERE --------------------
         *
         * Your code should return true if the two strings are anagrams of each other.
         *
         * */
        boolean result = false;

        char[] aArr = first.toCharArray();
        char[] bArr = second.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        if(Arrays.equals(aArr, bArr)) {
            result = true;
        }

        return result;

        /* -------------------- END OF INSERTION --------------------*/
    }
}
