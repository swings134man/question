package src.programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @package : programmers.lv2
 * @name : 게임맵최단거리_bfs.java
 * @date : 2024. 12. 17. 오후 3:52
 * @author : lucaskang
 * @Description: LV2 - BFS
**/
public class 게임맵최단거리_bfs {

    static int n,m, ans = -1;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
        return bfs(0,0,maps);
    }

    private static int bfs(int x, int y, int[][] maps) {
        Queue<int[]> qu = new LinkedList<>();

        // queue 시작점 추가
        qu.add(new int[]{x, y, 1});
        visited[x][y] = true;

        while (!qu.isEmpty()){
           int temp[] = qu.poll();
           x = temp[0];
           y = temp[1];
           int count = temp[2];

           // 도착점에 도달했을 경우
           if(x == n -1 && y == m-1) {
                ans = count;
                break;
           }

           // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위를 벗어나거나, 방문했거나, 벽이면 continue
                if(nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny] || maps[nx][ny] == 0) continue;

                // 방문처리
                visited[nx][ny] = true;
                qu.add(new int[]{nx, ny, count + 1});
            }
        }
        return ans;
    }//bfs
}
