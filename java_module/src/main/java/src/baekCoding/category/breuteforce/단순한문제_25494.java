package src.baekCoding.category.breuteforce;

import java.util.Arrays;
import java.util.Scanner;

public class 단순한문제_25494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);
            System.out.println(arr[0]);
        }
        sc.close();
    }
}
