package baekCoding.category.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.sort
 * @name : 배열합치기_11728.java
 * @date : 2025. 2. 13. 오후 11:45
 * @author : lucaskang(swings134man)
 * @Description: S5 - 정렬
**/
public class 배열합치기_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] arr = new int[n + m];

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 1
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 2
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i + n] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}
