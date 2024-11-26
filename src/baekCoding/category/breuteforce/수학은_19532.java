package baekCoding.category.breuteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수학은_19532 {
    public static void main(String[] args) throws IOException {
        // ax * by = c 일때, x, y 를 구하는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if(a * i + b * j == c && d*i + e*j == f){
                        System.out.println(i + " " + j);
                        break;
                }
            }
        }
    }
}
