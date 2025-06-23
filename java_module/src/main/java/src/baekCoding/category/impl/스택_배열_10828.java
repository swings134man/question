package src.baekCoding.category.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.impl
 * @name : 스택_배열_10828.java
 * @date : 2025. 2. 6. 오후 4:52
 * @author : lucaskang(swings134man)
 * @Description: 스택_10828 S4 문제 배열 풀이
**/
public class 스택_배열_10828 {

    static int[] stack = new int[10001];
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//in
        StringBuilder sb = new StringBuilder(); //out

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }//main

    private static void push(int num) {
        stack[size] = num;
        size++;
    }

    private static int pop() {
        if(size == 0) return -1;
        else {
            int val = stack[size -1];
            size --;

            return val;
        }
    }

    private static int size() {
        return size;
    }

    private static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    private static int top() {
        if(size == 0) return -1;
        else return stack[size -1];
    }
}
