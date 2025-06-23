package src.baekCoding.category.time_complex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * i: 1 ~ n-2
 * j: i+1 ~ n-1
 * k: j+1 ~ n
 *
 * (5 + 4 + 3 + 2 + 1) + (4 + 3 + 2 + 1) + (3 + 2  1) + (2 + 1) + 1 -> n이 7일때 계산되는 횟수: 시그마 합 공식
 *
 * 이건 시그마 합 공식....
 * -> (n-2)(n-1)n / 6
 */
public class 알고리즘수행시간6_24267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println((n-2) * (n-1) * n /6+ "\n" + 3);
    }
}
