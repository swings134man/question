package src.baekCoding.category.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * TODO: DFS, BFS 공부할 때 보기
 * DFS, BFS 의 결과를 모두 출력해야되는 문제(연습하기 좋음)
 * 그전에 "인접행렬" 을 통해 노드를 간선으로 연결해야함.
 */
public class dfsBfs_1260 {

    static Queue<Integer> qu = new LinkedList<>();
    static int[][] arr; // 노드와 간선 연결 배열
    static boolean[] visited; // 방문여부

    static int n; // node 갯수
    static int m; // 간선 갯수
    static int v; // 시작 노드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // node 갯수
        m = sc.nextInt(); // 간선 갯수
        v = sc.nextInt(); // 시작 노드

        // 인접행렬: 간선숫자대로 각 노드를 연결(배열에 저장)
        // 모든 노드 번호를 맞게 하려면, 0번 인덱스는 포함 X
        visited = new boolean[n + 1];
        arr = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            // 서로 연결 되어있다는것을 의미
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        sc.close();

        // DFS
         dfs(v);

        // BFS
        System.out.println();
        visited = new boolean[n + 1]; // 재할당
        bfs(v);

    }// main

    static void dfs(int startNode) {
        // 방문 체크
        visited[startNode] = true;
        System.out.print(startNode + " ");

        // node 갯수 만큼 for
        for (int i = 1; i <= n; i++) {
            if(arr[startNode][i] == 1 && visited[i] == false){ // target 노드가 i번 node 와 연결되어있지만, 방문안했을 경우
                // 재귀 1,2,3 ~ 시작 노드변경.
                // 예시로 1번노드랑 연결된 B노드, B노드랑 연결된 C 노드 ... 이런식으로 깊이 들어감
                dfs(i);
            }
        }
    }// dfs

    static void bfs(int startNode) {
        qu.add(startNode);
        visited[startNode] = true;
        System.out.print(startNode + " ");

        while (!qu.isEmpty()){
            int node = qu.poll();

            // node 갯수 만큼 돈다. -> 2,3,4 -> 1번 노드에 연결되어있으니 이걸로 끝,,,
            // 아니라고 해도,,
            for (int i = 1; i <= n; i++) {
                // 연결되어있고, 방문 안했을 경우
                if(arr[node][i] == 1 && visited[i] == false){
                    qu.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
