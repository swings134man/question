package baekCoding.category.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x보다작은수_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        String[] arr = br.readLine().split(" ");
        br.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(arr[i]);
            if(t < x){
                sb.append(t + " ");
            }
        }
        System.out.println(sb);
    }
}
