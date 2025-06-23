package src.baekCoding.before_basic;

import java.util.Scanner;
import java.util.Stack;

/************
 * @info : 백준 - 스택 - 10826
 * @name : Stack
 * @date : 2022/12/21 1:53 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class Stack_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<count; i++) {

            String str = sc.next();

            // push
            if(str.contains("push")) {
                stack.push(sc.nextInt());

            //pop
            }else if(str.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            // size
            }else if(str.equals("size")) {
                System.out.println(stack.size());
            // empty
            }else if(str.equals("empty")){
                System.out.println(stack.isEmpty() ? 1 : 0);
            // top
            }else if (str.equals("top")){
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        } //for

        sc.close();



    }
}
