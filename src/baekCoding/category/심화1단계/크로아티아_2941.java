package baekCoding.category.심화1단계;

import java.util.Scanner;

/**
 * 입력값에 따라 croatiaAlphabet 배열에 있는값이 존재하면 치환.
 * 치환이 끝나면, 문자열의 알파벳 갯수 출력 문제..
 */
public class 크로아티아_2941 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        String[] croatiaAlphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

        for(String sc : croatiaAlphabet){
            s = s.replace(sc, "A");
        }
        System.out.println(s.length());
    }
}
