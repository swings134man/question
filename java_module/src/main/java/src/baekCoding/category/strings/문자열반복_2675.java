package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            String[] s = br.readLine().split(" ");

            for (int j = 0; j < s[1].length(); j++) {
                for (int k = 0; k < Integer.parseInt(s[0]); k++) {
                    sb.append(s[1].charAt(j));
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}
