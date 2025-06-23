package src.baekCoding.category.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        StringBuffer sb = new StringBuffer();

        for (char c='a'; c <= 'z'; c++){
            sb.append(s.indexOf(c) + " "); // 없으면 -1, 있으면? 문자열 위치 반환
        }

//        System.out.println(sb.toString().substring(0, sb.toString().length() - 1));
        System.out.println(sb);
    }
}
