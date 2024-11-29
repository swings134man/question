package baekCoding.category.breuteforce;

import java.util.Scanner;

public class 설탕배달_2839 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;

        // 5나 3 으로 떨어져야 한다.
        while (n > 0) {
            if(n % 5 == 0){
                count += n /= 5;
                break;
            }else {
                // 5로 나눠 떨어 지지 않는경우 -> 3으로
                n -= 3; // 3을 계속 빼면서 count++ -> 3키로 몇개인지 확인가능
                count++;
            }

            // 5,3 으로 나누고 빼도 숫자가 남는경우 -> 안되는경우
            if(n < 0) {
                count = -1;
            }
        }

        System.out.println(count);
    }
}
