package programmers.lv2;

/**
 * @package : programmers.lv2
 * @name : 게임맵최단거리_dfs.java
 * @date : 2024. 12. 16. 오후 10:54
 * @author : lucaskang
 * @Description: 프로그래머스 LV2 - DFS/BFS : 이전에 BFS 로 풀었던문제 -> bfs 가 적합하지만 dfs 적용 해봄
 * - 테스트케이스는 전부 통과지만
 * - 효율성 테스트는 전부 fail(시간초과) -> bfs 로 풀어야 할듯?
**/
public class 게임맵최단거리_dfs {

    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int min = -1;

    public int solution(int[][] maps) {
        visited = new boolean[maps.length][maps[0].length];
        dfs(0,0,maps,1);

        return min;
    }

    private static int dfs(int x, int y, int[][]maps, int count) {
        int height = maps.length; // 도착지 x
        int width = maps[0].length; // 도착지 y

        // 끝에 도착했을 경우? : 최단거리 생각
        if(x == height -1 && y == width -1) {
            // 도달 했을경우
            if(min == -1){
                min = count;
                return 0; // 재귀 종료
            }
            // 최단거리 갱신
            else if(min > count){
                min = count;
                return 0;
            }

        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < height && ny >= 0 && ny < width && !visited[nx][ny] && maps[nx][ny] == 1) {
                // 갈 수 있는경우 방문처리
                visited[nx][ny] = true;
                dfs(nx, ny, maps, count + 1);
                // 방문처리 해제 -> 다른 경로가 있는지 탐색해야 하기 때문에 방문처리 해제
                visited[nx][ny] = false;
            }
        }

        // 갈 수 없으면 -1
        return min;
    }
}
