package src.baekCoding.category.geometry;

import java.util.Scanner;

public class 삼각형_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        int sum = x + y + z;

        if(x == 60 && y == 60 && z == 60) {
            System.out.println("Equilateral");
        }else if(sum > 180) {
            System.out.println("Error");
        }else if(sum == 180) {
            // 2개가 같은지: Isosceles
            // 1개가 같은지: Scalene
            if(x == y || x == z || y == z) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }
        }else {
            System.out.println("Error");
        }
    }
}
