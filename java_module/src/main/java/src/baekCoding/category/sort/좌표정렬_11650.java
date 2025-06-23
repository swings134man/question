package src.baekCoding.category.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @package : baekCoding.category.sort
 * @name : 좌표정렬_11650.java
 * @date : 2025. 2. 12. 오후 5:28
 * @author : lucaskang(swings134man)
 * @Description: S5 - 정렬
**/
public class 좌표정렬_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) { // x가 같으면
                return o1[1] - o2[1];
            }else {
                return o1[0] - o2[0];
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
