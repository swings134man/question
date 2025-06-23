package src.baekCoding.category.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 카드2_2164.java
 * @date : 2025. 2. 12. 오전 11:46
 * @author : lucaskang(swings134man)
 * @Description: S4 - queue
**/
public class 카드2_2164 {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            qu.add(i + 1);
        }

        while (true) {
            if(qu.size() == 1) {
                System.out.println(qu.poll());
                break;
            }

            // 맨위 버리기
            qu.poll();

            // 옮겨 담기
            qu.add(qu.poll());
        }
    }//main
}
