package src.baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 토마토2_7569_bfs.java
 * @date : 2024. 12. 27. 오후 4:52
 * @author : lucaskang(swings134man)
 * @Description: G5 - bfs: 토마토 x,y,z
**/
public class 토마토2_7569_bfs {

    static int m,n,h;
    static int[][][] arr;
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static Queue<int[]> qu = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();
        arr = new int[h][n][m];

        // arr
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
        sc.close();

        // 1인 요소 add
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(arr[i][j][k] == 1) {
                        qu.add(new int[]{i,j,k});
                    }
                }
            }
        }

        bfs();

        // check
        System.out.println(checkCount());
    }//main

    private static void bfs() {
        while (!qu.isEmpty()){
            int[] temp = qu.poll();

            for (int i = 0; i < 6; i++) {
                int nz = temp[0] + dz[i];
                int nx = temp[1] + dx[i];
                int ny = temp[2] + dy[i];

                if(nz >= 0 && nz < h && nx >=0 && nx < n && ny >=0 && ny < m) {
                    if(arr[nz][nx][ny] == 0) {
                        qu.add(new int[]{nz,nx,ny});
                        arr[nz][nx][ny] = arr[temp[0]][temp[1]][temp[2]] + 1;
                    }
                }
            }
        }
    }// bfs

    private static int checkCount() {
        int count = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if(arr[i][j][k] == 0) {
                        return -1;
                    }
                    count = Math.max(count, arr[i][j][k]);
                }
            }
        }

        if(count == 1) {
            return 0;
        }

        return count -1;
    }
}
