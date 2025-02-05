package baekCoding.category.company;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 임스함께_25757.java
 * @date : 2025. 2. 5. 오후 4:21
 * @author : lucaskang(swings134man)
 * @Description: S5 - 구현
 * - Y -2
 * - F - 3
 * - O - 4
 * 한번 한 사람과는 다시 안함.
 * 최대 몇번 게임 할 수 있는지 구하기
 *
 * 게임에 필요한 인원수는 주최자 포함이므로 -1 필요하고
 * set 에 담긴 인원수 / 게임에필요한 인원 -1 -> 결과
 * --> 7명과 가능 하고, 3명이필요하다면(주최자 -1) 7 / 2 = 3
**/
public class 임스함께_25757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int n = sc.nextInt();
        String type = sc.next(); // Y,F,O

        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }
        sc.close();

        if(type.equals("Y")) {
            System.out.println(set.size());
        }else if(type.equals("F")) {
            System.out.println(set.size() / 2);
        }else if (type.equals("O")) {
            System.out.println(set.size() / 3);
        }
    }//main
}
