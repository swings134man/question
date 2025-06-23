package src.baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 세번이내에사과를_26169.java
 * @date : 2025. 1. 7. 오후 2:12
 * @author : lucaskang(swings134man)
 * @Description: S3 - DFS
 * - 1은 사과, 0은 빈공간, -1은 벽
 * - 3번 이하의 이동으로 사과 2개 가능 = 1, 불가능 = 0
**/
public class 세번이내에사과를_26169 {

    static int[][] arr;
    static int n = 5;
    static int m = 5;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 시작점
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        sc.close();

        dfs(cx, cy, 0, 0);
        System.out.println(result);
    }//main

    private static void dfs(int cx, int cy, int depth, int apple) {
        if(arr[cx][cy] == 1){
            apple++;
        }

        if(depth == 3) {
            if(apple >= 2) {
                result = 1;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];

            // 배열의 범위 밖으로 벗어나거나 벽인 경우 이동을 안 함
            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5 || arr[nx][ny] == -1) {
                continue;
            }

            // 지금 이동한 칸으로 다시 돌아올 수 없으므로 임시로 벽을 세움
            arr[cx][cy] = -1;
            dfs(nx, ny, depth + 1, apple);
            // 다음 번의 탐색에는 세운 벽을 다시 없앰
            arr[cx][cy] = 0;
        }
    }//dfs
}
