package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            if (s.length() > 1) {
                sb.append(s.charAt(s.length() - 1));
            } else {
                sb.append(s.charAt(0));
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}
