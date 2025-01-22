package baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : ZOAC4_23971.java
 * @date : 2025. 1. 22. 오후 4:37
 * @author : lucaskang(swings134man)
 * @Description: ZOAC4 - 구현
 * - 기본적으로 1명은 앉을 수 있음 +1
 * - h 에 1명 자리 뺀값, N 칸 띄우고 앉을 수 있는 자리 갯수 (N+1) 로 나누고 +1 하면 가로 줄 가능 수
 * - w 도 동일
 * - 가로 * 세로 = 최대 수용 가능 갯수
**/
public class ZOAC4_23971 {

    static int w,h,n,m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        int x = (h - 1) / (n + 1) + 1;
        int y = (w - 1) / (m + 1) + 1;
        System.out.println(x * y);
    }//main
}
