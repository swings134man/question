package src.baekCoding.category.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.priority_queue
 * @name : 절댓값힙_11286.java
 * @date : 2024. 12. 19. 오후 11:25
 * @author : lucaskang(swings134man)
 * @Description: S1 - 우선순위 큐
 * - 절대값 기준으로 오름차순 정렬
 * - 절대값이 같다면, 원래 수 기준으로 오름차순 정렬
 * - PriorityQueue 의 Comparator 를 사용하여 정렬 (직접 구현하여 정렬)
**/
public class 절댓값힙_11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 비교할 두값이 같다면, 원래 수 기준으로 오름차순 정렬
                if(Math.abs(o1) == Math.abs(o2)) return o1 - o2;
                // 같지 않다면 절대값 기준으로 오름차순 정렬
                // o1 - o2 가 양수면 o1 이 크니 o2, o1 순서
                // o1 - o2 가 음수면 o2 가 크니 o1, o2 순서
                else return Math.abs(o1) - Math.abs(o2);
            }
        });

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(temp == 0) {
                if(pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll());
            }else {
                pq.offer(temp);
            }
        }
        sc.close();
    }
}
