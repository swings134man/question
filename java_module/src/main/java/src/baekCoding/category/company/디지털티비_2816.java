package src.baekCoding.category.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 디지털티비_2816.java
 * @date : 2025. 2. 4. 오후 6:27
 * @author : lucaskang(swings134man)
 * @Description: B1 - 구현
 * 1. 포인터 i+1 (올리기)
 * 2. 포인터 i-1 (내리기)
 * 3. 순서변경 아래로(i, i+1) 포인터는 i+1 을 가르킴
 * 4. 순서변경 위로(i, i-1) 포인터는 i-1
 *
 * KBS1, KBS2 가 각각 0,1 index 에 와야 하고 변경하는 순서를 연속된 위의 숫자로 표현출력
**/
public class 디지털티비_2816 {

    static String[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        arr = new String[n];

        // 채널 In
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        //KBS1 - 찾고, 올리기
        int index = 0;
        while (!arr[index].equals("KBS1")){
            index++;
            sb.append("1");
        }

        while (0 < index) {
            swap(index, index-1);
            index--;
            sb.append("4");
        }

        // KBS2 - 찾고 올리기 index 1까지 - swap 할 필요 없음
        while (!arr[index].equals("KBS2")){
            index++;
            sb.append("1");
        }

        while (1 < index) {
            index --;
            sb.append("4");
        }

        System.out.println(sb);
    }

    private static void swap(int a, int b) {
        String temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
