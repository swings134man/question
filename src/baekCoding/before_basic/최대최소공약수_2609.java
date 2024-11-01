package baekCoding.before_basic;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최대최소공약수_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        br.close();

        int max = gcd(a, b);
        int min = (a * b) / max;
        System.out.println(max);
        System.out.println(min);
    }

    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }
}