package baekCoding.category.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 모든 전구가 T 만 넘어가서 언제든 같이 켜지면되는거니까 => T의 약수로 만들어버리면 된다.
 */
public class 전구주기맞추기_32403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for (int x : arr){
            int num = 0;

            while (true){
                // 시간을 늘렸을 때 약수라면 조정할 필요가 없음
                if(t % (num + x) == 0) {
                    break;
                    // 시간을 뺏을때 그리고 1초보다는 안작아야 함
                }else if(t % (x - num) == 0 && (x -num) > 0) {
                    break;
                }else {
                    num++;
                }
            }
            sum += num;
        }

        System.out.println(sum);
    }
}
