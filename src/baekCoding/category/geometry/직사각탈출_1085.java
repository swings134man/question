package baekCoding.category.geometry;

import java.util.Scanner;

public class 직사각탈출_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();

        // x 최소거리
        int minx = Math.min(x, w - x);
        // y 최소거리
        int miny = Math.min(y, h - y);
        System.out.println(Math.min(minx, miny));
    }
}
