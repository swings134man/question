package baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 토마토_7576.java
 * @date : 2024. 12. 20. 오후 8:08
 * @author : lucaskang(swings134man)
 * @Description: G5 - bfs TODO: 다시풀기
 * 1. 1인 요소부터 탐색 시작해야됨
**/
public class 토마토_7576 {

    static int n,m,count = 0;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> qu = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                // 1인 요소를 qu 에 넣어줌
                if(arr[i][j] == 1){
                    qu.add(new int[]{i, j, 0});
                }else if(arr[i][j] == 0){ // 0인 요소의 갯수를 세어줌
                    count++;
                }
            }
        }

        System.out.println(bfs());
    }//main

    private static int bfs() {
        // res 는 0인 요소를 탐색할때마다 증가
        int res = 0;
        while (!qu.isEmpty()){
            int[] temp = qu.poll();
            int tx = temp[0];
            int ty = temp[1];
            res = temp[2];

            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];

                // 범위 안에 있고, 0인 요소이면
                if(nx >= 0 && nx < n && ny >= 0 & ny < m && arr[nx][ny] == 0){
                    qu.add(new int[]{nx, ny, res + 1});
                    count --; // 0 요소 갯수 감소
                    arr[nx][ny] = 1; // 방문했음을 표시
                }

                // 0인 요소가 없으면
                if(qu.isEmpty() && count == 0){
                    return res;
                }
            }
        }
        return -1;
    }//bfs
}
