package baekCoding.category.breuteforce;

import java.util.Scanner;

// TODO: 다시 풀기
// n 의 분해합 = n + (n 의 각 자릿수)
// 생성자(245)==n  = n 의 분해합 (256)
// 생성자는 없을수도, 여러개일수도 있음.
// 가장 작은 생성자 구하기.
public class 분해합_2231 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int result = 0;

        // ? + (? 의 각자릿수) = n
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int num = i;

            while(num != 0) {
                sum += num % 10; // 모든 자릿수 ++
                num /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
