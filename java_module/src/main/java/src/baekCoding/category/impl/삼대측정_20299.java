package src.baekCoding.category.impl;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 삼대측정_20299.java
 * @date : 2025. 2. 15. 오후 4:22
 * @author : lucaskang(swings134man)
 * @Description: B2 - 구현
**/
public class 삼대측정_20299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 팀 수
        int k = sc.nextInt(); // 팀 가입조건 기준(3명합)
        int l = sc.nextInt(); // 개인 레이팅 조건

        int count = 0; // 총 갯수
        ArrayList<Integer> list = new ArrayList<>(); // 결과값

        for (int i = 0; i < n; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            int three = sc.nextInt();

            boolean teamRating = k <= (one + two + three);
            boolean indi = one >= l && two >= l && three >= l;

            if(teamRating && indi) {
                count++;
                list.add(one);
                list.add(two);
                list.add(three);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(count).append("\n");

        for (Integer integer : list) {
            sb.append(integer).append(" ");
        }
        System.out.println(sb);
    }//main
}
