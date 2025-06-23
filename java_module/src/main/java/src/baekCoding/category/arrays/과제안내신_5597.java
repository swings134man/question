package src.baekCoding.category.arrays;

import java.util.Scanner;

public class 과제안내신_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[30];
        for (int i = 0; i < 28; i++) {
            int s = sc.nextInt();
            n[s - 1] = 1;
        }

        sc.close();

        for (int i = 0; i < n.length; i++) {
            if(n[i] != 1){
                System.out.println(i + 1);
            }
        }
    }
}
