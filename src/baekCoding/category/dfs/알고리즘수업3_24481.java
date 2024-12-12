package baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 알고리즘수업_24481.java
 * @date : 2024. 12. 12. 오후 10:45
 * @author : lucaskang
 * @Description: S2 - DFS
**/
public class 알고리즘수업3_24481 {

    static int n,m,depth;
    static ArrayList<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        depth = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        int start = sc.nextInt();

        list = new ArrayList[n + 1];
        arr = new int[n + 1];
        Arrays.fill(arr, -1); //-1로 채우기

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
        for (int i = 1; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void dfs(int node, int depth) {
        arr[node] = depth;

        for (int x : list[node]){
            if(arr[x] == -1){
                dfs(x, depth+1);
            }
        }
    }
}