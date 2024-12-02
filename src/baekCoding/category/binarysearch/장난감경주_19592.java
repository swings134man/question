package baekCoding.category.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * S5
 * x= 거리
 * y = 부스터속도 한계
 * z = 부스터 속도
 * v[] = 각 경기차 속도
 * 나는 n 번 -> 1 ~ n 번 존재
 *
 */
public class 장난감경주_19592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        // 1.n x y
        // 2.v[]
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int[] v = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                v[j] = Integer.parseInt(st.nextToken());
            }

            // 마지막 주제 제외, 완주 최소 시간
            double min = Double.MAX_VALUE;
            for (int j = 0; j < n-1; j++) {
                min = Math.min(min, 1.0 * x / v[j]);
            }

            // 부스터 안쓰고 단독우승 가능경우
            if(min > 1.0 * x / v[n-1]) {
                System.out.println(0);
            }else {
                // 부스터 최대 사용 했을때 단독 우승 가능한 경우?
                int left = 0;
                int right = y;

                while(left <= right){
                    int mid = (left + right) / 2;

                    // mid 만큼 부스터 사용시 단독우승 가능한 경우 right 줄이기.
                    if(min > ((1.0 * x - mid) / v[n-1]) + 1){
                        right = mid - 1;
                    }else {
                        left = mid + 1;
                    }
                }

                // 부스터를 최대이상으로 올려야 가능할 경우
                if(left > y) {
                    System.out.println(-1);
                }else {
                    System.out.println(left);
                }
            }
        }
        br.close();
    }//main
}
