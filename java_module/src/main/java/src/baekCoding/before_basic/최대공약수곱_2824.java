package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class 최대공약수곱_2824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            a = a.multiply(new BigInteger(st1.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            b = b.multiply(new BigInteger(st2.nextToken()));
        }

        String gcdRes = a.gcd(b).toString();
        if(gcdRes.length() > 9){
            gcdRes = gcdRes.substring(gcdRes.length() - 9);
            System.out.println(gcdRes);
        }else {
            System.out.println(gcdRes);
        }
    }
}