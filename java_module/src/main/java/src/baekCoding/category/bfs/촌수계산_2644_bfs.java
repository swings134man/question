package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 촌수계산_2644_bfs.java
 * @date : 2024. 12. 19. 오전 1:19
 * @author : lucaskang(swings134man)
 * @Description: s2 - bfs
**/
public class 촌수계산_2644_bfs {

    static int n,m; // 전체, 관계갯수
    static int start,end; // 부모번호, 자식
    static int[][] arr;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        start = sc.nextInt();
        end = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1][n + 1];
        visited = new int[n + 1];

        // Relation
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        sc.close();

        // bfs
        bfs(start);
        System.out.println(visited[end] == 0 ? -1 : visited[end]);
    }

    private static void bfs(int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);

        // 실질적 검사하는 부분
        while (!qu.isEmpty()){
            int temp = qu.poll();
            // 도달 했을 경우
            if(temp == end) break;

            // 도달하지 못해서 다음 node 찾아야 하는경우
            for (int i = 1; i < arr.length; i++) {
                if (arr[temp][i] == 1 && visited[i] == 0){
                    qu.add(i);
                    visited[i] = visited[temp] + 1;
                }
            }
        }
    }//bfs
}
