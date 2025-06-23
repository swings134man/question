package src.baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Scanner;

// TODO: BFS 로 풀어보기
// S2 - 쉬운방법 BFS - DFS 도 가능
// 간선을 인접행렬(배열) 로 받으면 메모리 초과 남 100,000^5 -> 인접리스트 사용해야함.... List
public class 트리부모찾기_11725 {

    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static int[] parent;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = n - 1;
        visited = new boolean[n + 1];
        parent = new int[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 0; i < n+1; i++) {
            list[i] = new ArrayList<>();
        }
        

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }
    }


    static void dfs(int node){
        visited[node] = true;

        for (int x : list[node]){
            if(!visited[x]){
                parent[x] = node; // ?
                dfs(x);
            }
        }
    }
}
