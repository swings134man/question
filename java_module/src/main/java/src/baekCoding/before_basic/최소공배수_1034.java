package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소공배수_1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println((a*b)/ gcd(a, b));
        }

        br.close();
    }

    static int gcd(int a, int b) {
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
}