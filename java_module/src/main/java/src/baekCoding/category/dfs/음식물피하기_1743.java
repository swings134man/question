package src.baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 음식물피하기_1743.java
 * @date : 2024. 12. 16. 오후 10:28
 * @author : lucaskang
 * @Description: S1 - DFS
 * - 그림_1926과 같이, 영역을 찾으면 주변과 관련된곳 찾아 count++;
 * - 새로운 영역 찾을때마다 이전 count 와 새로운 영역의 count 를 비교 후 가장 큰값 출력
**/
public class 음식물피하기_1743 {

    static int[][] arr;
    static boolean[][] visited;
    static int n,m,k;
    static int count;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            arr[a][b] = 1;
        }
        sc.close();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                if(!visited[i][j] && arr[i][j] == 1) {
                    dfs(i,j);
                    result = Math.max(result, count);
                }
            }
        }
        System.out.println(result);
    }//main

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        count ++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
