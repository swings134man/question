package src.baekCoding.category.dfs;


import java.util.Scanner;

// TODO: DFS 다시 풀어보기
// S2 - DFS, BFS
public class 연결요소의갯수_11724 {

    static int[][] arr;
    static boolean[] visited;
    static int n; //node
    static int m; // line

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        sc.close();

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(visited[i] == false) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int node) {
        if(visited[node] == true){
            return;
        }else {
            visited[node] = true;
            for (int i = 1; i <= n; i++) {
                if(arr[node][i] == 1){
                    dfs(i);
                }
            }
        }
    }
}
