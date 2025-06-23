package src.baekCoding.category.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @package : baekCoding.category.bfs
 * @name : 헌내기친구_21736_bfs.java
 * @date : 2025. 1. 7. 오후 11:14
 * @author : lucaskang(swings134man)
 * @Description: S2 - bfs
**/
public class 헌내기친구_21736_bfs {

    static int n,m;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;
    static Queue<int[]> qu = new LinkedList();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new String[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
                if(arr[i][j].equals("I")) {
                    qu.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        br.close();

        bfs();
        System.out.println(result == 0 ? "TT" : result);
    }//main

    private static void bfs() {
        while (!qu.isEmpty()){
            int[] temp = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < m && !arr[nx][ny].equals("X") && !visited[nx][ny]){
                    if(arr[nx][ny].equals("P")) {
                        result += 1;
                    }
                    qu.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }//bfs
}
