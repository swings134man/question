package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 쉬운최단거리_14940_bfs.java
 * @date : 2025. 1. 4. 오후 3:24
 * @author : lucaskang(swings134man)
 * @Description: S1 - BFS
 * - 0은 못가는 지점, 1은 가능한 지점
 * - 2는 출발지점
 * - 예외케이스 갈수있는곳(1) 중 도달못하는곳은 -1 처리 해야함
**/
public class 쉬운최단거리_14940_bfs {

    static int n,m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> qu = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j] == 2) {
                    arr[i][j] = 0;
                    qu.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        sc.close();

        bfs();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    arr[i][j] = -1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }// main

    private static void bfs() {
        while (!qu.isEmpty()){
            int[] temp = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 1 && !visited[nx][ny]){
                    qu.add(new int[]{nx, ny});
                    arr[nx][ny] = arr[temp[0]][temp[1]] + 1;
                    visited[nx][ny] = true;
                }
            }
        }
    }//bfs
}
