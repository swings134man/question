package baekCoding.category.dfs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO: DFS 다시풀기
// DFS S3
// 이미 방문한 노드를 다시 방문 한다면 1싸이클이 형성
public class 순열사이클_10451 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n + 1];
            boolean[] visited = new boolean[n + 1];

            for (int j = 1; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            // DFS 구현?
            for (int j = 1; j < arr.length; j++) {
                if (!visited[j]){ //false 일때(방문안했을 경우)
                    visited[j] = true;
                    int nextNode = arr[j];

                    while(true){
                        // 방문한 node 를 다시 방문 한다면 == 싸이클이 돈것(count++)
                        if(visited[nextNode]){
                            count++;
                            break;
                        }
                        visited[nextNode] = true;
                        nextNode = arr[nextNode]; // node 를 다음 노드로 이동
                    }
                }
            }
            System.out.println(count);
        }
        br.close();
    }//main
}
