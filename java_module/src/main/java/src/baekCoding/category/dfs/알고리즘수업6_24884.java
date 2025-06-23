package src.baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 알고리즘수업6_24884.java
 * @date : 2024. 12. 13. 오전 12:18
 * @author : lucaskang
 * @Description: S2 - DFS
 * - 알고리즘 5 문제와는 다르게, 방문노드가 내림차순으로 노드의 방문순서 * 노드의 깊이를 구하는 문제이다.
**/
public class 알고리즘수업6_24884 {
    static int n,m,count=1;
    static int[] arr, order;
    static ArrayList<Integer>[] list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int start = sc.nextInt();
        arr = new int[n + 1];
        order = new int[n + 1];
        list = new ArrayList[n + 1];
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
            Collections.sort(list[i], Collections.reverseOrder());
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
        arr[node] = depth;
        order[node] = count;

        for (int x : list[node]){
            if(arr[x] == -1){
                count++;
                dfs(x, depth + 1);
            }
        }
    }
}
