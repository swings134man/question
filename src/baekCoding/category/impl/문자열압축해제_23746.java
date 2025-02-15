package baekCoding.category.impl;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 문자열압축해제_23746.java
 * @date : 2025. 2. 16. 오전 2:10
 * @author : lucaskang(swings134man)
 * @Description: B1 - 구현
**/
public class 문자열압축해제_23746 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String value = sc.next();
            String key = sc.next();
            map.put(key, value);
        }

        String comp = sc.next(); // 대문자 타겟
        int start = sc.nextInt();
        int end = sc.nextInt();

        StringBuilder small = new StringBuilder();
        for (int i = 0; i < comp.length(); i++) {
            String s = map.get(String.valueOf(comp.charAt(i)));
            small.append(s);
        }

        System.out.println(small.substring(start -1, end));
    }//main
}
