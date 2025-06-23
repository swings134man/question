package src.baekCoding.category.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : 연구소_14502_dfsbfs.java
 * @date : 2024. 12. 24. 오후 6:27
 * @author : lucaskang(swings134man)
 * @Description: dfs, bfs 를 둘다 활용해야 하는 문제
 * 1. 벽을 세울 수 있는 경우는 dfs -> 벽을 3개 세울 때 마다 바이러스 bfs 시작
 * 2. 바이러스를 퍼트리는건 bfs -> bfs 끝날때 마다 최대 안전영역을 계산 해야함. -> 출력결론
 * 3. 바이러스를 퍼트리는건, 기존 지도에 영향을 미치면 안됨, 벽을 세우는 것은 기존 지도에서 벽을 세우고, dfs 종료시 원상복구로 가능.
**/
public class 연구소_14502_dfsbfs {

    static int n,m;
    static int max = Integer.MIN_VALUE; // 최대 안정영역값 저장
    static int[][] arr;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        dfs(0);

        System.out.println(max);
    }

    // 벽
    private static void dfs(int wallCnt) {
        // 벽이 다 세워졌으면 바이러스 퍼트리기
        if(wallCnt == 3){
            bfs();
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0){
                    arr[i][j] = 1; // 벽세우기
                    dfs(wallCnt + 1);
                    arr[i][j] = 0; // 원상복구
                }
            }
        }
    }

    // 바이러스
    private static void bfs() {
        Queue<int[]> qu = new LinkedList<>();
        // 카피맵
        int[][] copyArr = new int[n][m];
        for (int i = 0; i < n; i++) {
            copyArr[i] = arr[i].clone(); // Deep Copy
        }

        // 바이러스 찾아서 qu add
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 2){
                    qu.add(new int[]{i, j});
                }
            }
        }

        // 퍼트리기
        while (!qu.isEmpty()){
            int[] temp = qu.poll();

            for (int i = 0; i < 4; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if(nx >=0 && nx < n && ny >=0 && ny < m && copyArr[nx][ny] == 0){
                    qu.add(new int[]{nx, ny});
                    copyArr[nx][ny] = 2;
                }
            }
        }//while

        // 바이러스 전부 퍼트린 후 최대 안전영역 계산
        calcMaxArea(copyArr);
    }//bfs

    private static void calcMaxArea(int[][] copyArr) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(copyArr[i][j] == 0){
                    count++;
                }
            }
        }

        if(max < count) {
            max = count;
        }
    }
}
