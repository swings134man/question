package src.baekCoding.category.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.bfs
 * @name : 미로탐색_2178.java
 * @date : 2024. 12. 17. 오후 4:42
 * @author : lucaskang
 * @Description: S1 - BFS
**/
public class 미로탐색_2178 {

    static int n,m;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] c = s.toCharArray();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Character.getNumericValue(c[j]);
            }
        }

        // bfs
        bfs(0,0);
        System.out.println(arr[n-1][m-1]);
    }//main

    private static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList();
        qu.add(new int[]{x, y});
        visited[x][y] = true;

        while (!qu.isEmpty()){
            int[] temp = qu.poll(); // 현재
            int tx = temp[0];
            int ty = temp[1];

            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                // 각 방향이 벗어나지 않고, 방문하지 않았고, 갈수있는길(1) 이면
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && arr[nx][ny] == 1){
                    visited[nx][ny] = true;
                    qu.add(new int[]{nx, ny});
                    arr[nx][ny] = arr[tx][ty] + 1;
                }
            }
        }//while
    }//bfs
}
