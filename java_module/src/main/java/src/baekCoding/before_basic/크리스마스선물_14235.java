package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

// S3 - PQ(우선순위 큐)
/**
 * 1번줄: 방문횟수 n
 * a개 선물 충전 == 0
 *
 * 높은 숫자대로 줌(내림차순)
 */
public class 크리스마스선물_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringTokenizer st = null;

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if(a == 0) {
                if(pq.isEmpty()) {
                    System.out.println(-1);
                }else {
                    System.out.println(pq.poll());
                }
            }else {
                for (int j = 0; j < a; j++) {
                    int x = Integer.parseInt(st.nextToken());
                    pq.add(x);
                }
            }
        }
    }
}
