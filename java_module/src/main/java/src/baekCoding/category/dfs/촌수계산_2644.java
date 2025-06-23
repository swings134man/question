package src.baekCoding.category.dfs;

import java.util.Scanner;

// S2 - DFS
// 풀이: dfs() 를 한번씩 실행하면서, Count 를 증가시킴, depth 가 하나씩 증가할때마다 촌수증가 와 같은말
public class 촌수계산_2644 {

    static int[][] arr;
    static boolean[] visited;
    static int n;
    static int x;
    static int y;
    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        res = -1;
        n = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        int m = sc.nextInt();

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        sc.close();

        dfs(x,y, 0);
        System.out.println(res);
    }

    static void dfs(int start, int end, int count) {
        if(start == end) {
            res = count;
            return;
        }

        visited[start] = true;

        for (int i = 1; i <= n; i++) {
            if(arr[start][i] == 1 && !visited[i]) {
                dfs(i, end, count + 1);
            }
        }
    }
}
