package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 연결요소의갯수_11724_bfs.java
 * @date : 2024. 12. 19. 오전 2:35
 * @author : lucaskang(swings134man)
 * @Description: s2 - bfs
**/
public class 연결요소의갯수_11724_bfs {

    static int n,m;
    static int[][] arr;
    static boolean[] visited;

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

        int count = 0;
        for (int i = 1; i <= n; i++) {
            // 1 ~ node 까지 돌면서, 방문 안했으면 ++;
            // 연결된 요소들은 bfs 안에서 해결될것.
            if(!visited[i]) {
                bfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void bfs(int node) {
        Queue<Integer> qu = new LinkedList();
        qu.add(node);

        while (!qu.isEmpty()){
            int temp = qu.poll();
            for (int i = 1; i <= n; i++) {
                // 방문 안했고, 연결 되어 있으면
                if(!visited[i] && arr[temp][i] == 1){
                    visited[i] = true;
                    qu.add(i);
                }
            }
        }
    }//bfs
}
