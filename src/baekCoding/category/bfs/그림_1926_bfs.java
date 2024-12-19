package baekCoding.category.bfs;

import java.util.*;

/**
 * @package : baekCoding.category.bfs
 * @name : 그림_1926_bfs.java
 * @date : 2024. 12. 19. 오후 5:42
 * @author : lucaskang(swings134man)
 * @Description: s1 - bfs
**/
public class 그림_1926_bfs {

    static int n,m, count;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static List list = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                if(!visited[i][j] && arr[i][j] ==1) {
                    bfs(i,j);
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

    private static void bfs(int x, int y) {
        Queue<int[]> qu = new LinkedList();
        visited[x][y] = true;
        qu.add(new int[]{x, y});
        count++;

        while (!qu.isEmpty()){
            int[] temp = qu.poll();
            int tx = temp[0];
            int ty = temp[1];

            for (int i = 0; i < 4; i++) {
                int nx = tx + dx[i];
                int ny = ty + dy[i];
                if(nx >= 0 && nx < n && ny >=0 && ny < m && !visited[nx][ny] && arr[nx][ny] ==1){
                    qu.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
    }//bfs
}
