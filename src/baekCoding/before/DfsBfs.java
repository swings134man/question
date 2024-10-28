package baekCoding.before;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/************
 * @info : 백준 - DfsBfs 문제
 * @name : DfsBfs
 * @date : 2022/12/17 5:42 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * 1. 첫째 줄에 정점의 개수 N, 간선의 개수 M, 탐색을 시작할 정점번호 V
 * 2. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어짐.
 ************/
public class DfsBfs {

    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 정점의 갯수
        int M = sc.nextInt(); // 간선의 갯수
        int V = sc.nextInt(); // 탐색읠 시작할 정점 번호

        // 인접 행렬
        arr = new int[N +1 ][N + 1];
        for (int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        // DFS
        visited = new boolean[N +1];
        dfs(V);

        System.out.println();

        // BFS
        visited = new boolean[N +1];
        bfs(V);

    }//main

    // DFS
    private static void dfs(int V) {
        visited[V] = true;
        System.out.print(V + " ");

        if(V == arr.length) {
            return;
        }

        for (int j=0; j<arr.length; j++) {
            // 연결은 되어있지만 방문하지 않았다면?
            if(arr[V][j] == 1 & visited[j] == false) {
                dfs(j);
            }
        }
    }// dfs

    // BFS
    private static void bfs (int V) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(V);
        visited[V] = true;
        System.out.print(V + " ");

        // Queue가 비어있을때 까지
        while(!queue.isEmpty()) {
            int queNum = queue.poll();
            for(int i=1; i< arr.length; i++) {
                if(arr[queNum][i] == 1 && visited[i] == false){
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }

    }



}//class
