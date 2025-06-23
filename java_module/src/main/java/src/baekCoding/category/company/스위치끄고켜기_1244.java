package src.baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 스위치끄고켜기_1244.java
 * @date : 2025. 2. 7. 오후 9:57
 * @author : lucaskang(swings134man)
 * @Description: S4 - 구현 시뮬
 * 남학생은 num 의 배수의 전구 상태 변경
 * 여학생은 num 기준 좌,우 상태가 같지 않으면 num 의 상태 변경, -> 같으면 좌,우가 대칭인 구간을 찾아서 그 구간의 상태 변경
**/
public class 스위치끄고켜기_1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] arr = new boolean[n + 1];
        for (int i = 1; i <= n; i++) { // 0 index 제외
            int t = sc.nextInt();
            if(t == 1) arr[i] = true;
        }

        int r = sc.nextInt();
        for (int i = 0; i < r; i++) { //횟수 반복
            int gender = sc.nextInt();
            int targetNum = sc.nextInt();

            if (gender == 1) {
                for (int j = targetNum; j <= n; j+=targetNum) {
                    arr[j] = !arr[j];
                }
            }else {
                int left = targetNum - 1;
                int right = targetNum + 1;

                while (left > 0 && right <= n){
                    if(arr[left] != arr[right]) {
                        break;
                    }
                    left --;
                    right ++;
                }

                for (int j = left + 1; j < right; j++) {
                    arr[j] = !arr[j];
                }
            }
        }//for

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] ? 1 + " ": 0 + " ");
            if(i % 20 == 0) System.out.println();
        }
    }//main
}
