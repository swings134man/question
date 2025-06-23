package src.baekCoding.category.breuteforce;

import java.util.Scanner;

// A^2 = B^2 + N
// 1 <= B <= A <= 500
public class 완전제곱수_6131 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;

        for (int i = 1; i <= 500; i++) {
            for (int j = 1; j <= 500; j++) {
                if((i * i) == n + (j*j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
