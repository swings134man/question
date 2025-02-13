package baekCoding.category.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.sort
 * @name : 중복빼고정렬_10867.java
 * @date : 2025. 2. 14. 오전 12:03
 * @author : lucaskang(swings134man)
 * @Description: S5 - 정렬
**/
public class 중복빼고정렬_10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        HashSet<Integer> set = new HashSet<>();
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
