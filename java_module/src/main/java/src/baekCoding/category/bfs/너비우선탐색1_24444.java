package src.baekCoding.category.bfs;

import java.util.*;

/**
 * @package : baekCoding.category.bfs
 * @name : 너비우선탐색_1.java
 * @date : 2025. 1. 13. 오후 6:43
 * @author : lucaskang(swings134man)
 * @Description: 인접리스트를 오름차순 정렬
**/
public class 너비우선탐색1_24444 {

    static int n,m,r;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // node
        m = sc.nextInt(); // line
        r = sc.nextInt(); // start

        visited = new boolean[n + 1];
        result = new int[n + 1];
        list = new ArrayList[n + 1];

        // list 초기화
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        // list 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        sc.close();

        bfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }

    private static void bfs(int start) {
        int count = 1;
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        result[start] = count++;

        while (!qu.isEmpty()){
            int temp = qu.poll();
            // 리스트 정렬
            Collections.sort(list[temp]);
            // 방문안한
            for(int node: list[temp]){
                if(!visited[node]){
                    qu.add(node);
                    visited[node] = true;
                    result[node] = count++;
                }
            }
        }
    }//bfs
}
