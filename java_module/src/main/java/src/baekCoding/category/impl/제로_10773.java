package src.baekCoding.category.impl;

import java.util.Scanner;
import java.util.Stack;

/**
 * @package : baekCoding.category.impl
 * @name : 제로_10773.java
 * @date : 2024. 12. 29. 오전 12:50
 * @author : lucaskang(swings134man)
 * @Description: S4 - 구현
**/
public class 제로_10773 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            int number = sc.nextInt();
            if(number == 0){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else {
                stack.add(number);
            }
        }
        sc.close();

        int answer = 0;
        while (!stack.isEmpty()){
            answer += stack.pop();
        }
        System.out.println(answer);
    }//main
}
