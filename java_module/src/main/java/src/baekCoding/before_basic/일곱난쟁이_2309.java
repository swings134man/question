package src.baekCoding.before_basic;

import java.util.Arrays;
import java.util.Scanner;

// 완전 탐색
// 9요소를 전부 더한 후, 각 요소 즉 i, i+1 의 요소를 뺀다
// -> 그 뺀 요소가 100 이라면 해당 요소들을 0으로 만들고 정렬실행
// 두 요소 0 을 제외한 나머지 를 출력해야하기에 for 문으로 출력후 종료
public class 일곱난쟁이_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        sc.close();


        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum - numbers[i] - numbers[j] == 100){
                    numbers[i] = 0;
                    numbers[j] = 0;
                    Arrays.sort(numbers);

                    for (int k = 2; k < 9; k++) {
                        System.out.println(numbers[k]);
                    }
                    return;
                }
            }
        }
    }
}