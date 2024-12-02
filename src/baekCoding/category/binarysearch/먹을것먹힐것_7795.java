package baekCoding.category.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// T: 테이스케이스 num, 1줄: A수(n), B수(m)
/**
 * target 7
 * b.length 5
 *
 * b[] = 1 , 3 , 6
 *
 * left = 0 right = 2
 * mid = 1
 * b[1] = 3 < 7 --> left = 2
 *
 * left = 2 right = 2
 * mid = 2
 * b[2] = 6 < 7 --> left = 2 + 1 = 3
 *
 * return 3 (7보다 작은 요소 갯수)
 */
public class 먹을것먹힐것_7795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            int[] b = new int[m];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);
            Arrays.sort(b);

            // Calc
            int sum = 0;

            for (int j = 0; j < a.length; j++) {
                sum += search(b, a[j]);
            }

            // 시간초과
//            for (int j = a.length; j > 0; j--) {
//                for (int k = 0; k < b.length; k++) {
//                    if(a[j - 1] > b[k]){
//                        sum++;
//                    }
//                }
//            }
            System.out.println(sum);
        }//for
    }

    // a 값과 b[] 빠르게 찾기
    // a 요소보다 작은 b[] 요소 갯수 계산
    private static int search(int[] b, int target) {
        int left = 0;
        int right = b.length -1;

        while (left <=right){
            int mid = (left+right)/2;
            if(b[mid] < target){
                left = mid +1;
            }else {
                right = mid -1;
            }
        }
        return left;
    }
}
