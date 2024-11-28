package baekCoding.category.breuteforce;

import java.util.Scanner;

// B2
// 완전제곱수 - 첫줄 = 제곱수 합, 두번쨰줄 = 제곱수 중 최솟값, 없을 경우 -1
public class 완전제곱수_1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        int min = n;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int mul = i * j;
                if(i == j && mul >= m && mul <= n) {
                    sum += mul;
                    min = Math.min(mul, min);
                }
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
