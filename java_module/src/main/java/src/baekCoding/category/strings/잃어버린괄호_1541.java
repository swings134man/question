package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @package : baekCoding.category.strings
 * @name : 잃어버린괄호_1541.java
 * @date : 2025. 2. 4. 오후 4:59
 * @author : lucaskang(swings134man)
 * @Description: S2 - 문자열
 * - 주어진 수식에서 최솟값을 만드는 문제 (+,- 만 존재함)
 * - !! 이때 최솟값을 만드는 방법은 가장 큰 수를 빼주는 것.
 * - '-' 를 기준으로 나누고, 각각의 수식을 더하고, 모든 값을 빼주면 됨.
**/
public class 잃어버린괄호_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>(); // 각수식 값 저장
        String str = br.readLine();
        br.close();

        String[] arr = str.split("-"); // - 기준으로 분할

        // 분할된 수식들 계산
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            String[] splitStr = arr[i].split("\\+");

            for (String s : splitStr)
                sum += Integer.parseInt(s);

            // 계산결과값 list add
            list.add(sum);
        }

        // 모든 값 '-' 연산 수행: 다만 0번 index 는 존재해야하기에 미리 '+' 수행
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }

        System.out.println(result);
    }//main
}
