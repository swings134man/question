package baekCoding.category.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @package : baekCoding.category.sort
 * @name : 나이순_10814.java
 * @date : 2025. 2. 13. 오후 10:53
 * @author : lucaskang(swings134man)
 * @Description: S5 - 정렬
**/
public class 나이순_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            arr[i][0] = s[0];
            arr[i][1] = s[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }//main
}
