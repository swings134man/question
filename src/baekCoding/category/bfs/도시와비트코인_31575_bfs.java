package baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 도시와비트코인_31575_bfs.java
 * @date : 2024. 12. 19. 오전 1:47
 * @author : lucaskang(swings134man)
 * @Description: s3 - bfs
 * - 일반적으로 경로찾기 문제랑 같음, 다만 오른쪽,아래로만 이동할 수 있는 제약이 있음.
 * - 갈 수 있는길이면(지도를 벗어나지 않고, 갈 수 있는길) 이면 Queue 에 넣고 방문처리
 *  - 그럼 다음에 갈 길을 queue 에서 꺼내서 그 다음 길을 탐색하는 방식임.
**/
public class 도시와비트코인_31575_bfs {

    static int n,m;
    static int[][] arr;
    static int[][] visited;
    static int[] dx = {1,0};
    static int[] dy = {0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m][n];
        visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(bfs(0,0));
    }

    private static String bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(new int[]{x,y});
        visited[x][y] = 1;

        while (!qu.isEmpty()) {
            int[] temp = qu.poll();
            int tx = temp[0];
            int ty = temp[1];

            // 도착 했을 경우?
            if(tx == m - 1 && ty == n -1) return "Yes";

            // 못했을경우: 가능한 다음 노드 탐색. -> 오른쪽, 아래로만 이동가능
            for (int i = 0; i < 2; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                if(nx >= 0 && nx < m && ny >=0 && ny < n && arr[nx][ny] == 1 && visited[nx][ny] == 0){
                    qu.add(new int[]{nx, ny});
                    visited[nx][ny] = 1;
                }
            }
        }
        return "No";
    }
}
