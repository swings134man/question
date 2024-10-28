package baekCoding.before_basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/************
 * @info : 백준 - 바이러스(bfs) - 2605번
 * @name : 바이러스
 * @date : 2022/12/18 6:59 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : 바이러스 bfs 해설.
 * N : node갯수
 * M : 간선 갯수
 * V : 시작 번호.
 ************/
public class 바이러스 {

    static int[][] arr;
    static boolean[] visited;
    static int n,m,v;
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();  // 컴퓨터의 갯수 (node)
        m = sc.nextInt(); // 연결되어있는 컴퓨터 쌍의 갯수.
        v = 1;  // 시작 노드 번호.

        // 인접 행렬
        arr = new int[n +1][n +1]; // 각 정점간 탐색 경로 저장 배열
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        sc.close();

        // bfs
        visited = new boolean[n +1]; // 정점의 탐색 여부 체크 배열
        System.out.println(bfs(v));

        count = 0; // 초기화.

        // dfs
        visited = new boolean[n +1];
        System.out.println(dfs(v));
    }//main

    // bfs - 인접 행렬
    private static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(start); // 시작점
        visited[start] = true;

        //Queue가 Empty까지
        while (!queue.isEmpty()) {
            int queNum = queue.poll(); // queue 값

            for(int i=1; i<arr.length; i++) {
                if(arr[queNum][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;
    }

    // dfs - 인접 행렬
    private static int dfs(int start) {
        visited[start] = true;

        for (int i=1; i<=n; i++) { // node 갯수만큼.
            if(arr[start][i] == 1 && visited[i] == false){ // [1][다른노드] ==1 (연결되어있고) && 방문하지않았을때.
                count ++;
                dfs(i); // 재귀.
            }
        }
        return count;
    }//dfs


}//class
