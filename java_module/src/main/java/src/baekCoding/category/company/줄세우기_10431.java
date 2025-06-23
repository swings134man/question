package src.baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 줄세우기_10431.java
 * @date : 2025. 2. 4. 오후 6:49
 * @author : lucaskang(swings134man)
 * @Description: S5 - 구현
 * - 정렬을 할 필요는 없다 -> 갯수만 구하면됨
 * - A 번부터 index -1 까지 뒤로 옮김
 * - 즉 index 번앞에 큰수의 갯수 ++ 하면됨
**/
public class 줄세우기_10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[20]; // 20 고정

        for (int i = 0; i < n; i++) {
            int result = 0;
            int testNumber = sc.nextInt();

            // input
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            // result count
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < j; k++) {
                    if(arr[j] < arr[k]){
                        result++;
                    }
                }
            }
            System.out.println(testNumber+ " " + result);
        }

        sc.close();
    }//main
}
