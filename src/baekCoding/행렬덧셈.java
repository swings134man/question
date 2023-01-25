package baekCoding;

import java.util.Scanner;

/************
 * @info : 백준 - 행렬 덧셈_2378 (Java)
 * @name : 행렬덧셈
 * @date : 2023/01/25 11:33 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 행렬덧셈 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        // 2차 배열 2개가 존재 할때 각원소를 더한 값을 2차배열 값에 넣어야 함.
        // for문 2번 돌아야함.
        for (int i = 0; i < 2; i++) {
            // N
            for (int j = 0; j < N; j++) { // N
                for (int k = 0; k < M; k++) { // M
                    arr[j][k] += sc.nextInt();
                }
            }
        }//for

        // 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
