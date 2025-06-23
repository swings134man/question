package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @package : baekCoding.category.strings
 * @name : 균형잡힌세상_4949.java
 * @date : 2025. 2. 4. 오후 5:36
 * @author : lucaskang(swings134man)
 * @Description: S4 - 문자열
 * 각 괄호가 균형있게 있는지 확인
 * '.' 이면 종료
 * stack 으로 괄호 출현시 push, 다음 괄호가 나오면 pop
 * -> 결국 !stack.isEmpty() 면 no
**/
public class 균형잡힌세상_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();

            if(str.equals("."))
                break;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if(ch == '(' || ch == '[')
                    stack.push(ch);

                // 닫는괄호 조건
                if(ch == ')') {
                    if(stack.empty()) {
                        stack.push(ch);
                        break;
                    }

                    if(stack.peek() == '(') stack.pop();
                    else break;
                }else if(ch == ']') {
                    if(stack.empty()) {
                        stack.push(ch);
                        break;
                    }

                    if(stack.peek() == '[') stack.pop();
                    else break;
                }
            }

            // 비교
            if(stack.isEmpty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }//while

        System.out.println(sb);
    }//main
}
