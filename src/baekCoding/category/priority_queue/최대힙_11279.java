package baekCoding.category.priority_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.priority_queue
 * @name : 최대힙_11279.java
 * @date : 2024. 12. 19. 오후 10:33
 * @author : lucaskang(swings134man)
 * @Description: S2 - 우선순위 큐
 *
 * - PriorityQueue 의 인자에 Collections.reverseOrder() 를 넣어주면 내림차순으로 정렬됨.
 * - 아무것도 넣지 않는다면 오름차순으로 정렬됨.
**/
public class 최대힙_11279 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> qu = new PriorityQueue(Collections.reverseOrder()); // 내림차순

        for (int i = 0; i < n; i++) {
            int target = sc.nextInt();
            if(target == 0){
                if(qu.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(qu.poll());
                }
            }else {
                qu.add(target);
            }
        }
        sc.close();
    }
}
