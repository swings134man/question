package src.baekCoding.category.심화1단계;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 팰린드롬확인_10988 {
    // 숏코딩,,,,,,
    public static void main(String[] args) {
        String a = new Scanner(System.in).next();
        String b = new StringBuffer(a).reverse().toString();
        System.out.println(a.equals(b)? 1 : 0);
    }

    // first
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] s = br.readLine().split("");
//        String[] t = new String[s.length];
//        br.close();
//
//        for (int i = 0; i < s.length; i++) {
//            t[i] = s[s.length - 1 -i];
//        }
//
//        boolean is = false;
//        for (int i = 0; i < s.length; i++) {
//            if(!s[i].equals(t[i])){
//                is = true;
//            }
//        }
//
//        System.out.println(is? 0 : 1);
//    }
}