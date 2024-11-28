package baekCoding.category.breuteforce;

import java.util.Scanner;

// B2
// n 의 뒤 2자리를 00 부터 ++,  x / f == 0 이면 정답 뒤 2자리 숫자 출력
public class 나누기_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        sc.close();

        n /= 100;
        n *= 100;

        int result = 0;
        while (n % f != 0) {
            n++;
            result++;
        }

        if(result < 10) {
            System.out.println("0" + result);
        }else {
            System.out.println(result);
        }
    }
}
