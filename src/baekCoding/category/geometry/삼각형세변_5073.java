package baekCoding.category.geometry;

import java.util.Scanner;

public class 삼각형세변_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            // 입력이 0 0 0인 경우 종료
            if (x == 0 && y == 0 && z == 0) {
                break;
            }

            int max = Math.max(x, Math.max(y, z));
            if(max < x + y + z -max) {
                if(x == y && x == z) {
                    System.out.println("Equilateral");
                }else if(x == y || x == z || y == z) {
                    System.out.println("Isosceles");
                }else {
                    System.out.println("Scalene");
                }
            }else {
                System.out.println("Invalid");
            }
        }
    }
}
