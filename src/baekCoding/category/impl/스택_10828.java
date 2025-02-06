package baekCoding.category.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @package : baekCoding.category.impl
 * @name : 스택_10828.java
 * @date : 2025. 2. 6. 오후 4:37
 * @author : lucaskang(swings134man)
 * @Description: S4 - 구현
 * 정수 저장 스택 구현
 * push x : 정수 x 스택에 push
 * pop : 스택에서 pop 출력, 없으면 -1
 * size : 스택에 들어있는 정수 개수 출력
 * empty : 스택이 비어있으면 1, 아니면 0
 * top : 스택의 가장 위에 정수 출력, 없으면 -1
**/
public class 스택_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n - for
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            String cmd = arr[0];

            if(cmd.equals("push")) {
                int cnt = Integer.parseInt(arr[1]);
                stack.push(cnt);
            }else if(cmd.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }else if(cmd.equals("size")) {
                System.out.println(stack.size());
            }else if(cmd.equals("empty")){
                System.out.println(stack.isEmpty() ? 1 : 0);
            }else if(cmd.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }//for
    }//main
}
