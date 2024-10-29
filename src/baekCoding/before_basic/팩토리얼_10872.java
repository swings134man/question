package baekCoding.before_basic;

import java.util.Scanner;

public class 팩토리얼_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = recursive(n);
        System.out.println(result);
    }

    public static int recursive(int n) {
        if(n <= 1) return 1;
        return n * recursive(n - 1);
    }
}