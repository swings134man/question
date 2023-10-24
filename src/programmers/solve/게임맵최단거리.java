package programmers.solve;

import java.util.LinkedList;
import java.util.Queue;

/************
 * @info : 프로그래머스 - 게임맵최단거리 Lv2
 * @name : 게임맵최단거리
 * @date : 2022/12/24 12:12 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * 1. BFS(너비우선) 사용
 *
 * ----------------------
 * 1. dx, dy는 4방향 탐색을 위한 배열
 * 2. 시작 위치는 0,0 = 1 이고.
 * 3. 범위를 벗어 났는지, 방문 했는지, 갈 수 있는지? 에 대한것을 체크.
 * 4. 문제 없으면 해당위치까지 방문한 수 +1
 ************/
public class 게임맵최단거리 {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            // 4분할 탐색
            for (int i = 0; i < 4; i++) {
                // 이동 후 위치
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 벗어났는지, 방문했는지, 갈수 있는길인지?
                if(nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length
                           && visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    visited[nx][ny] = visited[x][y] +1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }


    public int solution(int[][] maps) {
        int answer = 0;

        // visited
        int[][] visited = new int[maps.length][maps[0].length];
        visited[0][0] = 1; // 시작 위치

        bfs(maps, visited);
        answer = visited[maps.length - 1][maps[0].length - 1];

        if(answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {

    } //main
}
