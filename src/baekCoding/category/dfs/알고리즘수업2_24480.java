package baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//S2 - DFS
/**
 * 1. 내림차순이기에 list[i] 즉 인접리스트 내부 요소를 내림차순 정렬해줘야함.
 * 2. count 변수의 경우 각 노드가 몇번째에 방문되었는지 확인하기위해 DFS() 할 때마다 내부에서 ++;
 * 3. arr[] 배열은 각 노드가 몇번째에 방문되었는지 저장하는 배열 -> count 변수를 넣어줌으로써 해당 인덱스에는 몇번쨰 방문인지 알 수 있기떄문.
 */
public class 알고리즘수업2_24480 {

    static int n, m, count = 1;
    static ArrayList<Integer>[] list;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int start = sc.nextInt();

        arr = new int[n + 1];
        list = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for (int i = 0; i < list.length; i++) {
            Collections.sort(list[i], Collections.reverseOrder());
        }

        dfs(start);
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

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
