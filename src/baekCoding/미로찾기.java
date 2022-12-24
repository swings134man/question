package baekCoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/************
 * @info : 백준 - 2178 미로찾기
 * @name : 미로찾기
 * @date : 2022/12/25 12:32 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 미로찾기 {

    static int n,m;
    static int[][] map;
    static boolean[][] visited;


    public static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{x, y});

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            int[] xy = queue.poll();

            for (int i = 0; i < 4; i++) {
                int neX = xy[0] + dx[i];
                int neY = xy[1] + dy[i];

                if (neX < 0 || neX >= n || neY < 0 || neY >= m || visited[neX][neY]
                        || map[neX][neY] == 0) {
                    continue;
                }

                // 다음 탐색 지점을 큐에 추가
                queue.add(new int[] { neX, neY });

                // 다음 탐색 지점 탐색처리
                visited[neX][neY] = true;

                // 다음 탐색 지점의 비용을 현재 좌표 + 1 로 변경
                map[neX][neY] = map[xy[0]][xy[1]] + 1;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // String 1줄을 갖고와서 자름. (row, col)

        // 초기 지도 제작 & 방문여부, 시작점 세팅.
        n = Integer.parseInt(st.nextToken()); // 행(row)
        m = Integer.parseInt(st.nextToken()); // 열(col)

        map = new int[n][m]; // row, col 갯수 만큼 배열 선언 -> 미로 지도 생성.
        visited = new boolean[n][m]; // 방문 여부
        visited[0][0] = true; // 시작점.

        // 지도 생성.
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            for(int j=0; j<m; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(map[n -1][m-1]);
    } //main
}//class
