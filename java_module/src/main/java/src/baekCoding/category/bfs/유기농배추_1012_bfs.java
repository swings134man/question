package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 유기농배추_1012_bfs.java
 * @date : 2024. 12. 19. 오후 4:29
 * @author : lucaskang(swings134man)
 * @Description: S2 - bfs
 * - 1 주변에 있는건 모두 하나의 묶음, count++;
 * - 상하좌우
 * - 각 요소를 돌아야 한다(2중 for) 그리고 상하좌우에 있는 1을 방문처리 한다.
 *   - 이때 처음 방문 할때는 count++ 를 해줘야 한다. -> 그렇기에 main 에서 처리한다.
 * - dfs 내부에서는 주변에 있는 1 만을 방문 처리.
**/
public class 유기농배추_1012_bfs {

    static int T,M,N,K;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();
            arr = new int[M][N];
            visited = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
            }
            count = 0;


            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    if(!visited[j][k] && arr[j][k] == 1){
                        bfs(j,k);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }
        sc.close();
    }

    private static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList();
        qu.offer(new int[]{x, y});
        visited[x][y] = true;

        while (!qu.isEmpty()){
            int[] temp = qu.poll();
            int tx = temp[0];
            int ty = temp[1];

            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                if(nx >=0 && nx < M && ny >= 0 && ny < N && !visited[nx][ny] && arr[nx][ny] == 1) {
                    qu.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }//bfs
}
