package baekCoding.category.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.dfs
 * @name : 섬의개수_4963_dfs.java
 * @date : 2024. 12. 20. 오후 7:24
 * @author : lucaskang(swings134man)
 * @Description: s2 - dfs
**/
public class 섬의개수_4963_dfs {

    static int h,w;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0, -1,1,-1,1};
    static int[] dy = {0,0,-1,1, -1,-1,1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String str = " ";
        while (!(str = br.readLine()).equals("0 0")){
            st = new StringTokenizer(str);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            arr = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if(!visited[i][j] && arr[i][j] == 1){
                        count ++;
                        dfs(i,j);
                    }
                }
            }
            sb.append(count).append("\n");
        }//while
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < h && ny >= 0 && ny < w && !visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx,ny);
            }
        }
    }
}
