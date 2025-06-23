package src.baekCoding.category.impl;

import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 색종이_2563.java
 * @date : 2025. 2. 6. 오후 5:12
 * @author : lucaskang(swings134man)
 * @Description: s5 - 구현
 * 색종이의 넓이를 구하는 문제
 * 가로세로 10 이고, x,y 는 왼쪽 벽 기준으로 부터 떨어진 거리, 아래부터 떨어진 거리 임
 * - 각 색종이의 넓이 에서 겹치는걸 뺼 생각을 하지말고, bool 배열에서 false 인것만 갯수를 세주면 넓이가 됨.
**/
public class 색종이_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;
        boolean[][] visited = new boolean[101][101];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if(!visited[j][k]) {
                        visited[j][k] = true;
                        total ++;
                    }
                }
            }
        }
        System.out.println(total);
    }
}
