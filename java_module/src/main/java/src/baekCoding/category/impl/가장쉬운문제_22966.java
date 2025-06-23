package src.baekCoding.category.impl;

import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 가장쉬운문제_22966.java
 * @date : 2025. 2. 15. 오후 4:49
 * @author : lucaskang(swings134man)
 * @Description: B2 - 구현
**/
public class 가장쉬운문제_22966 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String p = "";
        int rank = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int r = sc.nextInt();

            if(r < rank) {
                p = s;
                rank = r;
            }
        }
        System.out.println(p);
    }//main
}
