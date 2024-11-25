package baekCoding.category.geometry;

import java.util.Arrays;
import java.util.Scanner;

public class 세막대_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        sc.close();

        Arrays.sort(arr);

        if(arr[0] + arr[1] > arr[2]) {
            System.out.println(arr[0] + arr[1] + arr[2]);
        }else {
            // 작은 2개를 더하고 *  -1
            // 둘레를 구하는거니까,,, a+b > c 를 성립하게 하려면
            // 최대 둘레 = (작은 2개의 둘레) + 큰 한변의 길이 (다만 A+B > C 가 성립해야함)
            // c는 a+b 보다 -1 작아야함 -> 최대둘레는 즉 (a+b) + (a+b -1)
            // 수식 a+b * 2 -1
            System.out.println((arr[0] + arr[1]) * 2 -1);
        }
    }
}
