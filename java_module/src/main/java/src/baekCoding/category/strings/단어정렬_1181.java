package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @package : baekCoding.category.strings
 * @name : 단어정렬_1181.java
 * @date : 2025. 2. 3. 오후 5:48
 * @author : lucaskang(swings134man)
 * @Description: S5 - 문자열
 * N 개의 문자열이 주어짐
 * 조건에 맞춰 정렬하여 출력
 * 1. 길이가 짧은것 부터
 * 2. 길이가 같으면 사전순으로
 * 3. 중복은 하나만 남김
**/
public class 단어정렬_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        // Sorting
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }else {
                    return o1.length() - o2.length();
                }
            }
        });

        // distinct
        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            if(!arr[i -1].equals(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }//main
}
