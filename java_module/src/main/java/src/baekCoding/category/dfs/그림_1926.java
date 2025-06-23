package src.baekCoding.category.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 그림_1926.java
 * @date : 2024. 12. 16. 오후 4:47
 * @author : lucaskang
 * @Description: S1 - DFS
 * 1이 2개 이상 이면 그림++; -> 총 갯수 print
 * -> 1이 주변에 있어야 함 그럼 count++
 * 가장 큰 집합 -> print
**/
public class 그림_1926 {

    static int n,m; //n: 세로, m: 가로
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count;
    static ArrayList<Integer> list = new ArrayList<>(); // size: 총갯수, 정렬후 제일 마지막값: 제일 큰갯수


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        count = 0;
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                if(!visited[i][j] && arr[i][j] == 1) {
                    dfs(i,j);
                    list.add(count);
                }
            }
        }

        Collections.sort(list);

        if(list.isEmpty()) {
            System.out.println(0);
            System.out.println(0);
        }else {
            System.out.println(list.size());
            System.out.println(list.get(list.size() - 1));
        }
    }//main

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        count ++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 방향
            if(nx >=0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
