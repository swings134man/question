package baekCoding.category.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 공바꾸기_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int one, two, temp;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            one = Integer.parseInt(st.nextToken()) -1;
            two = Integer.parseInt(st.nextToken()) -1;

            temp = arr[one];
            arr[one] = arr[two];
            arr[two] = temp;
        }
        br.close();

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
