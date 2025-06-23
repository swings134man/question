package src.baekCoding.category.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 너비우선탐색4_24447.java
 * @date : 2025. 1. 13. 오후 9:36
 * @author : lucaskang(swings134man)
 * @Description: 노드의 깊이(d), 노드방문순서(t) 를 구하여 0번 index 부터 d*t 의 값 +=
 * 인접 정접은 오름차순 정렬
**/
public class 너비우선탐색4_24447 {

    static int n,m,r;
    static int count = 1;
    static boolean[] visited;
    static ArrayList<Integer>[] list;
    static long[] d,t; // depth, 방문순서


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt() - 1;

        list = new ArrayList[n];
        d = new long[n];
        t = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
            d[i] = -1; // depth
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            list[a].add(b);
            list[b].add(a);
        }

        bfs(r);

        long result = 0L;
        for (int i = 0; i < n; i++) {
            result += d[i] * t[i];
        }

        System.out.println(result);
    }

    private static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        d[start] = 0L;
        t[start] = count++;

        while (!qu.isEmpty()) {
            int temp = qu.poll();
            long depth = d[temp];
            for (int node : list[temp]) {
                if(d[node] == -1) { //방문하지않았다면 ?
                    qu.add(node);
                    d[node] = depth + 1;
                    t[node] = count++;
                }
            }
        }
    }
}
