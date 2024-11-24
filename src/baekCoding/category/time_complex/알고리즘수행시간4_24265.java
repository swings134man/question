package baekCoding.category.time_complex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 등차수열 공식 사용해야함...
 * 수행시간은 n^2
 * -> 문제의 function 은 1~n 을 더한 값을 뜻한다.
 * -> 등차수열로 표현하자면, n*(n-1) / 2 => O((n^2-n) / 2) 이기 때문에 N^2 인것
 */
public class 알고리즘수행시간4_24265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        br.close();
        System.out.println(n * (n -1) / 2+ "\n" + 2);
    }
}
