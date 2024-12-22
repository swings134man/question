package baekCoding.category.dfs;

import java.util.Scanner;

/**
 * @package : baekCoding.category.dfs
 * @name : AB_16953.java
 * @date : 2024. 12. 22. 오후 5:44
 * @author : lucaskang(swings134man)
 * @Description: S2 - dfs
 * 1. A -> B 로 가는 최소 연산 횟수
 * 2. 2를 곱하거나, 1을 수의 가장 오른쪽에 추가하는 연산만 가능
 * -- A 를 B 로 만드는게 아닌 B 를 A 로 만드는게 쉬움
**/
public class AB_16953 {

    static int count = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != a) {
            if( b < a ) {
                System.out.println(-1);
                return;
            }
            String str = String.valueOf(b);
            if(b % 2 == 0) {
                b /= 2;
            } else if(str.charAt(str.length() - 1) == '1') {
                str = str.substring(0, str.length() - 1);
                b = Integer.parseInt(str);
            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }

        System.out.println(count);
    }
}
