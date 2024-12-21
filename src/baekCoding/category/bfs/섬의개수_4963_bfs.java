package baekCoding.category.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.bfs
 * @name : 섬의개수_4963_bfs.java
 * @date : 2024. 12. 20. 오후 6:33
 * @author : lucaskang(swings134man)
 * @Description: S2 - bfs - 상하좌우, 대각선 을 갈 수 있다.
 *
**/
public class 섬의개수_4963_bfs {

    static int h,w;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0, -1,1,-1,1}; // 좌,우,상,하, 대각 / 하좌, 하우, 상좌, 상우
    static int[] dy = {0,0,-1,1, -1,-1,1,1}; // 좌,우,상,하, 대각 / 하좌, 하우, 상좌, 상우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 0 0 이 나오면 stop
        String str = " ";
        while (!(str = br.readLine()).equals("0 0")){ // str 에 값 대입, str 이 "0 0" 이 아니면 계속
            st = new StringTokenizer(str);

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            arr = new int[h][w];
            visited = new boolean[h][w];

            // TC
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
                        bfs(i,j);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }//while
        br.close();
        System.out.println(sb);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<>();
        visited[x][y] = true;
        qu.add(new int[]{x,y});

        while (!qu.isEmpty()){
            int[] temp = qu.poll();
            int tx = temp[0];
            int ty = temp[1];

            for (int i = 0; i < 8; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                if(nx >=0 && nx < h && ny >=0 && ny < w && !visited[nx][ny] && arr[nx][ny] == 1){
                    qu.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
