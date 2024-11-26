package baekCoding.category.breuteforce;

import java.util.Scanner;

// TODO: 다시 풀어보기
public class 설탕배달_2839 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;

        while (n > 0){
            // 5로 나눠 떨어지면?
            if(n % 5 == 0){
                count += n/5;
                break;
            }else {
                // 3 이거나, 안되는 경우?
                n -= 3;
                count++;
            }

            // 5,3 으로 해결 불가한 경우
            if(n < 0) {
                count = -1;
            }
        }

        System.out.println(count);
    }
}
