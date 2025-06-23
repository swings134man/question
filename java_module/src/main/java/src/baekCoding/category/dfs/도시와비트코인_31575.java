package src.baekCoding.category.dfs;

import java.util.Scanner;

// TODO: BFS 로 다시 풀이
// S3 - DFS
public class 도시와비트코인_31575 {

    static int n; // 가로
    static int m; // 세로
    static int[][] arr;
    static boolean[][] visited;

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

        System.out.println(dfs(0,0) ? "Yes" : "No");
    }//main

    static boolean dfs(int x, int y) {
        // 끝에 도달 했다면?
        if(x == m -1 && y == n-1) {
            return true;
        }

        // 도달하지 못하는 경우: 이미 방문했거나, 범위를 벗어났거나(x가 m 보다 크면 범위를 벗어나는것.), 해당 위치가 0 인경우
        // visited 를 나중에 검사해야함. -> 먼저 범위를 검사해야함.
        if(x < 0 || y < 0 || x >= m || y >= n || arr[x][y] == 0 || visited[x][y]) {
            return false;
        }

        visited[x][y] = true;

        // 오른쪽 이동
        if(dfs(x + 1, y)) {
            return true;
        }

        // 아래 이동
        if(dfs(x , y + 1)) {
            return true;
        }

        // 최종 도달하지 못한 경우
        return false;
    }
}
