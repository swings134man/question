package baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 상수_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int first = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
        int second = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());

        System.out.println(Math.max(first, second));

        br.close();
    }
}
