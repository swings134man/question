package baekCoding.category.심화1단계;

import java.util.Scanner;

public class 체스_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] target = {1,1,2,2,2,8};
        int[] number = new int[6];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        sc.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            sb.append(target[i] - number[i] + " ");
        }
        System.out.println(sb);
    }//main
}
