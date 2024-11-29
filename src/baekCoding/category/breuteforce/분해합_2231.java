package baekCoding.category.breuteforce;

import java.util.Scanner;

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
            int num = i; // 나눠야 하기 때문

            // 0이 될때 까지
            while(num != 0) {
                sum += num % 10; // 한자리씩 sum에 더하기
                num /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }//main
}
