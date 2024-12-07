package baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// S2 - DFS
public class 알고리즘수업1_24479 {

    static int n, m, count = 1;
    static ArrayList<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int startNode = sc.nextInt();

        arr = new int[n + 1];
        list = new ArrayList[n + 1];

        // 0 ~ n(5): 6개의 ArrayList 생성 -> 0번 index 는 사용하지 않음.
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        // list.length 만큼 list[i] 의 요소들을 오름차순 정렬
        for (int i = 0; i < list.length; i++) {
            Collections.sort(list[i]);
        }

        dfs(startNode);

        // 0번 인덱스는 없기에 1번부터 끝까지. 6: 0(사용X) 1 2 3 4 5
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }// main

    static void dfs(int node) {
        arr[node] = count;

        for (int x : list[node]) {
            if(arr[x] == 0){
                count++;
                dfs(x);
            }
        }
    }
}
