package baekCoding.category.impl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 요세푸스0_11866.java
 * @date : 2025. 2. 6. 오후 5:21
 * @author : lucaskang(swings134man)
 * @Description: S5 - 구현 요세푸스 알고리즘
 * - 큐 를 사용하여 풀 수 있음
 * - k - 1번을 큐의 맨뒤에 삽입 하고 k 번째가 되었을땐 poll() 삭제 및 출력으로 해결할 수 있음.
**/
public class 요세푸스0_11866 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            qu.offer(i);
        }

        sb.append("<");
        while (qu.size() > 1) {

            for (int i = 0; i < k-1; i++) {
                int temp = qu.poll();
                qu.offer(temp);
            }

            sb.append(qu.poll()).append(", ");
        }//while
        sb.append(qu.poll()).append(">");

        System.out.println(sb);
    }
}
