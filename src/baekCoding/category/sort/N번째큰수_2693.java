package baekCoding.category.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @package : baekCoding.category.sort
 * @name : N번째큰수_2693.java
 * @date : 2025. 2. 12. 오후 5:01
 * @author : lucaskang(swings134man)
 * @Description: B1 - 정렬
**/
public class N번째큰수_2693 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {
            int[] arr = new int[10];

            for (int j = 0; j < 10; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            result[i] = arr[7];
        }

        Arrays.stream(result).forEach(System.out::println);
    }//main
}
