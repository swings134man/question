package src.baekCoding.category.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @package : baekCoding.category.strings
 * @name : 듣보잡_1764.java
 * @date : 2025. 2. 3. 오후 6:18
 * @author : lucaskang(swings134man)
 * @Description: S4 - 문자열
 *
 * - 듣도 -> 이걸 ArrayList 에 저장해서 Contains() -> 시간초과 발생
 *
**/
public class 듣보잡_1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //듣도 못한 사람
        int m = sc.nextInt(); //보도 못한 사람

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String temp = sc.next();
            if(set.contains(temp)) {
                list.add(temp);
            }
        }

        // sorting
        Collections.sort(list);

        System.out.println(list.size());
        list.forEach(System.out::println);
    }// main
}
