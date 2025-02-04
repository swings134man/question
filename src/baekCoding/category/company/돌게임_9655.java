package baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 돌게임_9655.java
 * @date : 2025. 2. 4. 오후 6:09
 * @author : lucaskang(swings134man)
 * @Description: S5 - 기업코테 (Math, DP)
 * N 이 주어짐, 1개 || 3개 가져갈 수 있음, 시작은 SK 후자는 CY
 * - 단순하게 생각 : 규칙성이 존재함 SK 가 무조건 먼저 시작하고, N 이 홀수 이면 승리, 짝수면 패배
**/
public class 돌게임_9655 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(n % 2 == 0 ? "CY" : "SK");
    }
}
