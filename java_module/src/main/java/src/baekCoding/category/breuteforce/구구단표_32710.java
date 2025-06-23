package src.baekCoding.category.breuteforce;

import java.util.Scanner;

public class 구구단표_32710 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        boolean is = false;

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int multi = i * j;
                if(n == i || n == j || n == multi) {
                    is = true;
                    break;
                }
            }
            if(is) break;
        }
        System.out.println(is ? 1 : 0);
    }
}
