package src.baekCoding.category.priority_queue;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.priority_queue
 * @name : 최소힙_1927.java
 * @date : 2024. 12. 19. 오후 11:06
 * @author : lucaskang(swings134man)
 * @Description: S2 - 우선순위 큐
**/
public class 최소힙_1927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue();
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();

            if(temp == 0){
                if(queue.isEmpty()){
                    System.out.println(0);
                }else {
                    System.out.println(queue.poll());
                }
            }else {
                queue.offer(temp);
            }
        }
        sc.close();
    }//main
}
