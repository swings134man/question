package baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 유기농배추_1012_dfs.java
 * @date : 2024. 12. 19. 오후 5:09
 * @author : lucaskang(swings134man)
 * @Description: s2 - dfs
**/
public class 유기농배추_1012_dfs {

    static int T,M,N,K;
    static int[][] arr;
    static boolean[][] visited;
    static int count;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            arr = new int[M][N];
            visited = new boolean[M][N];
            count = 0;

            for (int j = 0; j < K; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
            }


            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(!visited[j][k] && arr[j][k] == 1){
                        dfs(j,k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx,ny);
            }
        }
    }
}
