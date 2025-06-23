package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대문자 입력값으로 1초씩
public class 다이얼_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[] bytes = br.readLine().getBytes();
        br.close();

        int n = 0;
        for (int i = 0; i < bytes.length; i++) {
            if('A' <= bytes[i] && bytes[i] <= 'C') n += 3;
            else if('D' <= bytes[i] && bytes[i] <= 'F') n += 4;
            else if('G' <= bytes[i] && bytes[i] <= 'I') n += 5;
            else if('J' <= bytes[i] && bytes[i] <= 'L') n += 6;
            else if('M' <= bytes[i] && bytes[i] <= 'O') n += 7;
            else if('P' <= bytes[i] && bytes[i] <= 'S') n += 8;
            else if('T' <= bytes[i] && bytes[i] <= 'V') n += 9;
            else n += 10;
        }
        System.out.println(n);
    }
}
