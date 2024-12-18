package baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 도시와비트코인_refactor.java
 * @date : 2024. 12. 19. 오전 2:16
 * @author : lucaskang(swings134man)
 * @Description: DFS 기존꺼 refactoring
**/
public class 도시와비트코인_refactor {

    static int[][] arr;
    static boolean[][] visited;
    static int n,m;
    static int[] dx = {1,0};
    static int[] dy = {0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m][n];
        visited = new boolean[m][n];

        // Map 작성
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println(dfs(0,0));
    }

    private static String dfs(int x, int y) {
        visited[x][y] = true;
        // 도달한 경우
        if(x == m - 1 && y == n -1) return "Yes";

        for (int i = 0; i < 2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny] && arr[nx][ny] == 1){
                // 갈 수 있는 조건: Return 값을 정의해서, dfs 안하는 조건을 추가해야함: 못가는경우
                if(dfs(nx, ny).equals("Yes")) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}
