package baekCoding.category.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 등수구하기_1205.java
 * @date : 2025. 2. 7. 오후 9:37
 * @author : lucaskang(swings134man)
 * @Description: S4 - 구현
 * n 새로운점수, p: 10 <= p <=50, N 은 P 보다 작거나 같음
 * -> 둘째줄 현재랭킹 리스트 비오름차순
**/
public class 등수구하기_1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tae = sc.nextInt();
        int p = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) { // 가능한 점수까지만
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());

        // 불가 조건
        if(p == n && tae <= arr[arr.length - 1]) {
            System.out.println(-1);
        }else {
            int result = 1;
            for (int i = 0; i < arr.length; i++) {
                if(tae < arr[i]) {
                    result++;
                }else {
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
