package baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 안전영역_2468.java
 * @date : 2024. 12. 16. 오후 9:45
 * @author : lucaskang
 * @Description: S1 - DFS
 *
 * - 1 부터 최댓값까지 하나씩 검사하면서, n 만큼의 영역이 생기면 stop
 * - 1 ~ maxHigh 돌면서, 안전지대 최대 갯수 구하기
**/
public class 안전영역_2468 {

    static int[][] arr;
    static boolean[][] visited;
    static int n, result = 1;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n][n];
        int maxHigh = 0; // 최고 높이

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                maxHigh = Math.max(maxHigh, arr[i][j]);
            }
        }
        sc.close();

        // 1 ~ maxHigh 돌면서, 안전지대 최대 갯수 구하기
        for (int i = 1; i <= maxHigh; i++) {
            visited = new boolean[n][n];
            int count = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if(arr[j][k] > i && !visited[j][k]){
                        count++;
                        dfs(j,k,i);
                    }
                }
            }
            result = Math.max(count, result);
        }
        System.out.println(result);
    }//main

    private static void dfs(int x, int y, int high) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && arr[nx][ny] > high) {
                dfs(nx, ny, high);
            }
        }
    }
}
