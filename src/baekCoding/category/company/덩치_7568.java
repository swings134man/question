package baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 덩치_7568.java
 * @date : 2025. 2. 5. 오후 3:12
 * @author : lucaskang(swings134man)
 * @Description: S5 - 브루트포스 기업
 *
 * - (x,y) X,y 가 비교대상보다 크면 덩치가 큰것
 * - 하나라도 작으면 덩치가 크다고 안함. (같은등수)
 * - 대상보다 덩치큰 사람이 k 명이면 자신의 등수는 k+1 등
**/
public class 덩치_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i][0] = x;
            arr[i][1] = y;
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;

            for (int j = 0; j < n; j++) {
                if(i == j) continue;

                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) rank++;
            }
            System.out.print(rank + " ");
        }
        sc.close();
    }//main
}
