package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        br.close();

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(s.charAt(i));
        }
        System.out.println(result);
    }
}
