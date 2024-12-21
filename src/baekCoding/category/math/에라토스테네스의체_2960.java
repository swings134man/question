package baekCoding.category.math;

import java.util.Scanner;

/**
 * @package : baekCoding.category.math
 * @name : 에라토스테네스의체_2960.java
 * @date : 2024. 12. 20. 오후 7:32
 * @author : lucaskang(swings134man)
 * @Description: S2- 소수 구하기 2중 for -> 타임아웃
 * -> TODO: 에라토스테네스의 체 부터 공부 다시
**/
public class 에라토스테네스의체_2960 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[] arr = new int[n + 1]; // 0 ~ n

        // N 보다 작은 수: 배열 초기화(0,1 제외)
        for (int i = 2; i <= n ; i++) {
            arr[i] = i;
        }

        // 2 ~ N 까지의 수 중에서, 가장 작은 수의 배수를 지워나간다. (2의 배수, 3의 배수, 4의 배수...)
        for (int i = 2; i <= n; i++) {
            if(arr[i] == 0) continue; // 이미 지워진 수라면 pass

            // i 의 배수를 지운다.
            // j+=i : i 의 배수를 지운다.
            for (int j = i; j <= n; j+=i) {
                if(arr[j] != 0){
                    arr[j] = 0;
                    k --;

                    // K 번째 지운수
                    if(k == 0) {
                        System.out.println(j);
                        return;
                    }
                }
            }
        }//for
    }
}
