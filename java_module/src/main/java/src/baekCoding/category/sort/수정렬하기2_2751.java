package src.baekCoding.category.sort;

import java.io.*;
import java.util.*;

/**
 * @package : baekCoding.category.sort
 * @name : 수정렬하기2_2751.java
 * @date : 2025. 2. 12. 오후 5:07
 * @author : lucaskang(swings134man)
 * @Description: S5 - 정렬
 * - Arrays.sort() 사용시 시간초과 발생.
 * - 시간줄이기 위해 -> Collections.sort() + BufferedReader 사용
**/
public class 수정렬하기2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        br.close();

        Collections.sort(list);

        for (int num : list) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
