package baekCoding.category.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * S4 - 이분탐색
 * -> 코드가 똑같은데(다른예제) 왜 틀리게 나오는지 이해가 안됨;;;;;;;
 */
public class 암기왕_2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            HashSet<Integer> set = new HashSet<>();

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            // m
            int m = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                boolean res = set.contains(Integer.parseInt(st.nextToken()));
                sb.append(res ? 1 : 0).append("\n");
            }
            System.out.println(sb);
        }
    }// main
}
