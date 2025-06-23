package src.baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 알고리즘수업5_24883.java
 * @date : 2024. 12. 12. 오후 11:53
 * @author : lucaskang
 * @Description: S2 - DFS
 * - 알고리즘 3,4 문제와 다른건, 노드방문순서 * 노드깊이
 * - arr 시작 node 를 0 으로 초기화해야하고, sum 결과값을 long 으로 선언 필요함 -> 100,000,000 이 node 의 최댓값 이기에 int 로는 표현 불가능
**/
public class 알고리즘수업5_24483 {
    static int n,m,count=1;
    static int[] arr, order; // arr: 노드의 깊이, order: 노드의 방문순서
    static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int start = sc.nextInt();

        list = new ArrayList[n + 1];
        order = new int[n + 1];
        arr = new int[n + 1];
        Arrays.fill(arr, -1);

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            list[b].add(a);
        }
        sc.close();

        for (int i = 1; i <= n; i++) {
            Collections.sort(list[i]);
        }

        arr[start] = 0;
        dfs(start, 0);

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long)arr[i] * order[i];
        }
        System.out.println(sum);
    }

    private static void dfs(int node, int depth) {
        arr[node] = depth; // 해당 node 의 depth
        order[node] = count;

        for (int x : list[node]) {
            if(arr[x] == -1) {
                count++;
                dfs(x, depth + 1);
            }
        }
    }
}
