package src.baekCoding.category.bfs;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 정수a를k로만들기_25418.java
 * @date : 2025. 1. 17. 오후 6:05
 * @author : lucaskang(swings134man)
 * @Description: S3 - bfs
 * - 연산1: A + 1
 * - 연산2: A * 2
 * A => k 로 만들기 위한 최소 연산 횟수
 *
 * - 시간초과
**/
public class 정수a를k로만들기_25418 {

    static int a,k;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        k = sc.nextInt();
        sc.close();

        bfs();
    }

    private static void bfs() {
        Queue<int[]> qu = new ArrayDeque<>();
        boolean[] visited = new boolean[k + 1];
        qu.add(new int[]{a, 0});
        visited[a] = true;

        while (!qu.isEmpty()){
            int[] temp = qu.poll();
            if(temp[0] == k) {
                System.out.println(temp[1]);
                return;
            }
            if(temp[0] * 2 <= k) {
                visited[temp[0] * 2] = true;
                qu.add(new int[]{temp[0] * 2, temp[1] + 1});
            }

            // A + 1:
            if(!visited[temp[0] + 1]) {
                qu.add(new int[] {temp[0] + 1, temp[1] + 1});
            }
        }
    }//bfs
}
