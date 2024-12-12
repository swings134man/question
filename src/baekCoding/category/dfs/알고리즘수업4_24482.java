package baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 알고리즘수업4_24482.java
 * @date : 2024. 12. 12. 오후 11:46
 * @author : lucaskang
 * @Description: S2 - DFS
 * 알고리즘3 문제와는 같다. 단지 list의 요소가 reverseOrder()로 정렬되어있을 뿐.
 * -> 문제3도 노드의 깊이, 문제4도 노드의 깊이를 구하는 문제이다.
**/
public class 알고리즘수업4_24482 {

    static int n,m = 0;
    static ArrayList<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int start = sc.nextInt();

        list = new ArrayList[n + 1];
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
            Collections.sort(list[i], Collections.reverseOrder());
        }

        arr[start] = 0;
        dfs(start, 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(arr[i]);
        }
    }//main

    private static void dfs(int node, int depth) {
        arr[node] = depth;

        for (int x : list[node]){
            if(arr[x] == -1){
                dfs(x, depth + 1);
            }
        }
    }
}
