package baekCoding.category.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @package : baekCoding.category.dfs
 * @name : 헌내기친구_21736.java
 * @date : 2025. 1. 7. 오후 3:59
 * @author : lucaskang(swings134man)
 * @Description: S2 - dfs
**/
public class 헌내기친구_21736 {

    static int n,m;
    static String[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        arr = new String[n][m];
        visited = new boolean[n][m];

        int[] start = new int[2];
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = String.valueOf(line.charAt(j));
                if (arr[i][j].equals("I")) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        br.close();

        dfs(start[0], start[1]);
        System.out.println(result == 0 ? "TT" : result);
    }//main

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < m && !arr[nx][ny].equals("X") && !visited[nx][ny]){
                if(arr[nx][ny].equals("P")){
                    result += 1;
                }
                dfs(nx, ny);
            }
        }
    }
}
