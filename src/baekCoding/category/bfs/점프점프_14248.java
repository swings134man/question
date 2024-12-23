package baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 점프점프_14248.java
 * @date : 2024. 12. 23. 오후 3:17
 * @author : lucaskang(swings134man)
 * @Description: S2 - bfs
 * - dfs 는 timeout 나올가능성이 있음 n = 10,000 이상일때, depth stack 이 깊어짐
**/
public class 점프점프_14248 {

    static int n,s;
    static int[] arr;
    static boolean[] visited;
    static int count;
    static int[] dx = {-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count = 0;
        arr = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        s = sc.nextInt();

        // 돌다리 수 만큼
        bfs(s - 1);
        System.out.println(count);
    }

    private static void bfs(int node) {
        Queue<Integer> qu = new LinkedList<>();
        visited[node] = true;
        qu.add(node);

        while (!qu.isEmpty()){
            int temp = qu.poll();
            int target = arr[temp]; // 노드의 숫자
            count++;

            for (int next : new int[]{temp + target, temp - target}){
                // 이동거리가 음수거나, n을 넘어가거나, 방문했으면 continue
                if(next < 0 || next >= n || visited[next]) {
                    continue;
                }
                qu.add(next);
                visited[next] = true;
            }
        }//while
    }
}
