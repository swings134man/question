package baekCoding.category.time_complex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * i = 1 - n
 * j = 1 - n
 * k = 1 - n
 */
public class 알고리즘수행시간5_24266 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println(n * n * n + "\n" + 3);
    }
}
