package src.baekCoding.category.breuteforce;

import java.util.Scanner;

public class 영화감독_1436 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int target = 666;
        int count = 1;

        while (count != n) {
            target ++;
            if(String.valueOf(target).contains("666")) {
                count++;
            }
        }
        System.out.println(target);
    }
}
