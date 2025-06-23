package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 바이러스_2606.java
 * @date : 2024. 12. 19. 오전 1:06
 * @author : lucaskang(swings134man)
 * @Description: S3 - BFS: 인접행렬
**/
public class 바이러스_2606 {

    static int[][] arr;
    static boolean[] visited;
    static int n,m,count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int start = 1;
        count = 0;
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        sc.close();

        System.out.println(bfs(start));
    }

    private static int bfs(int node) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(node);
        visited[node] = true;

        while (!qu.isEmpty()){
            int pollNode = qu.poll();
            
            // 연결되어있는 node 탐색
            for (int i = 1; i < arr.length; i++) {
                // poll 된 node 와 연결된 node, 방문하지않은 -> queue add
                if(arr[pollNode][i] == 1 && !visited[i]){
                    qu.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        return count;
    }//bfs
}
