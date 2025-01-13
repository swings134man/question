package baekCoding.category.bfs;

import java.util.*;

/**
 * @package : baekCoding.category.bfs
 * @name : 너비우선탐색_2.java
 * @date : 2025. 1. 13. 오후 7:11
 * @author : lucaskang(swings134man)
 * @Description: 인접리스트를 내림차순 정렬
**/
public class 너비우선탐색2_24445 {

    static int n,m,r;
    static int count = 1;
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int[] result;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        r = sc.nextInt();

        list = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }

        bfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(result[i]);
        }
    }

    private static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        result[start] = count++;

        while (!qu.isEmpty()){
            int temp = qu.poll();
            Collections.sort(list[temp], Collections.reverseOrder());
            for (int node : list[temp]){
                if(!visited[node]) {
                    qu.add(node);
                    visited[node] = true;
                    result[node] = count++;
                }
            }
        }
    }//bfs
}
