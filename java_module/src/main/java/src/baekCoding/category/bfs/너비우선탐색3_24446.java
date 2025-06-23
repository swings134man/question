package src.baekCoding.category.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 너비우선탐색3_24446.java
 * @date : 2025. 1. 13. 오후 7:22
 * @author : lucaskang(swings134man)
 * @Description: node 는 1부터 시작이지만 0번 index 부터 출력 (깊이가 0부터임), 방문하지않은곳은 -1
**/
public class 너비우선탐색3_24446 {

    static int n,m,r;
    static int count = 0;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt() -1;

        visited = new boolean[n];
        result = new int[n];
        list = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
            result[i] = -1;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() -1;
            int b = sc.nextInt() -1;
            list[a].add(b);
            list[b].add(a);
        }

        bfs(r);

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        result[start] = 0;

        while (!qu.isEmpty()) {
            int temp = qu.poll();
            int beDepth = result[temp];
            for (int node : list[temp]) {
                if(!visited[node]){
                    qu.add(node);
                    visited[node] = true;
                    result[node] = beDepth + 1;
                }
            }
        }
    }//bfs
}
