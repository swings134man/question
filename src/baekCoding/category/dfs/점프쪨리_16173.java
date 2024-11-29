package baekCoding.category.dfs;

import java.util.Scanner;

/**
 * S4
 *
 * 시작은 항상 {0,0}, 목표는 항상 {n -1, n -1}
 *
 * 구역 크기 n 이 주어짐 n * n
 * 각 구역의 int 만큼 이동 가능. -1 이면 완주(HaruHaru), 도달 불가하면(Hing)
 *
 * 이동 = 오른쪽, 아래만 가능
 * 각 발판의 숫자만큼만 이동 가능하며, 그 숫자를 넘어가는건 안됨
 * 그럼 예제 1번 기준 0,1 - 0,2 - 2,2 가 됨
 */
public class 점프쪨리_16173 {

    static int n;
    static int[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                arr[i][j] = num;
            }
        }
        sc.close();

        // DFS?
        System.out.println(dfs(0, 0) ? "HaruHaru" : "Hing");
    }

    static boolean dfs(int x, int y) {
        int number = arr[x][y];

        // 도착했다면?
        if(number == -1){
            return true;
        }

        // 이미 방문 했다면
        if(visited[x][y]) {
            return false;
        }

        visited[x][y] = true;

        if(x + number < n && dfs(x + number, y)){
            return true;
        }

        if(y + number < n && dfs(x, y + number)) {
            return true;
        }

        return false;
    }
}
