package baekCoding.before_basic;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

// PQ(우선순위큐) S3
// 오름차순이니까 내림차순으로 바꿔야함
public class N번쨰큰수_2075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬 queue

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.add(sc.nextInt());
            }
        }

        sc.close();

        for (int i = 0; i < n-1; i++) {
            pq.remove();
        }

        System.out.println(pq.poll());
    }
}
