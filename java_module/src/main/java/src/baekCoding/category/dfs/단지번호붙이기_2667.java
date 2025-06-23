package src.baekCoding.category.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @package : baekCoding.category.dfs
 * @name : 단지번호붙이기_2667.java
 * @date : 2024. 12. 13. 오후 3:06
 * @author : lucaskang
 * @Description: S1 - DFS
 * - 묶여있는 단지를 카운트 하는것이 중요하다.
 * - 시작지점부터 이동해서 - 좌표를 벗어 나지 않고 - 1=집이 존재한다면
**/
public class 단지번호붙이기_2667 {

    static int n, count; // count: 아파트갯수
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0}; // left: -1, right:1
    static int[] dy = {0,0,-1,1}; // up: -1, down: 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        count = 1;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Character.getNumericValue(s.charAt(j));
            }
        }
        br.close();

        ArrayList<Integer> list = new ArrayList<>(); // Count 갯수를 담을 List
        int res = 0; // 단지갯수를 담을 변수

        // dfs 조건: 하나의 단지를 다 돌고 다른단지 탐색해야함
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if(!visited[i][j] && arr[i][j] == 1){
                    dfs(i,j);
                    list.add(count);
                    res ++;
                }
            }
        }

        Collections.sort(list); // 집의 수 오름차순
        System.out.println(res);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }// main

    private static void dfs(int x, int y) {
        arr[x][y] = 0; // 0으로 방문처리 완료?
        visited[x][y] = true;
        count += 1;

        // 상하좌우 이동 및 dfs
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 좌표 벗어났는지
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1){
                dfs(nx, ny);
            }
        }
    }
}
