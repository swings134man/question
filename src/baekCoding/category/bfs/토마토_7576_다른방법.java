package baekCoding.category.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.bfs
 * @name : 토마토_7576_다른방법.java
 * @date : 2024. 12. 27. 오후 3:54
 * @author : lucaskang(swings134man)
 * @Description: G5 - bfs: 0 갯수에서 바꿀떄마다 -- 방법(기존)
 * - 새로운 방법: 0인 요소를 탐색할떄마다 -> 기존 토마토 num 에서 +1
**/
public class 토마토_7576_다른방법 {

    static int m,n;
    static int[][] arr;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<int[]> qu = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n][m];

        // arr 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // 1인 요소 qu add
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1){
                    qu.add(new int[]{i, j});
                }
            }
        }

        bfs();

        // 0인 요소 -1, 0없으면 최댓값 출력
        System.out.println(checkCount());
    }//main


    private static void bfs() {
        while (!qu.isEmpty()){
            int[] temp = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if(nx >=0 && nx < n && ny >=0 && ny < m && arr[nx][ny] == 0){
                    qu.add(new int[]{nx, ny});
                    arr[nx][ny] = arr[temp[0]][temp[1]] + 1;
                }
            }
        }
    }//bfs

    private static int checkCount() {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0){
                    return -1;
                }
                count = Math.max(count, arr[i][j]);
            }
        }

        // 1 이면, 하루라도 안됬다는 의미
        if(count == 1){
            return 0;
        }else {
            // 기존 카운트가 1부터 시작했으니 -1 해줘야 카운트 성립
            return count -1;
        }
    }//check
}
