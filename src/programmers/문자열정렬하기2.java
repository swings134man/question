package programmers;

import java.util.Arrays;
import java.util.Locale;

/************
 * @info : 프로그래머스 - 문자열 정렬하기 (2)
 * @name : 문자열정렬하기2
 * @date : 2023/01/16 4:41 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 문자열정렬하기2 {

    public static String solution (String my_string) {
        String answer = "";

        // 소문자
        String low = my_string.toLowerCase(Locale.ROOT);

        // 정렬
        char[] arr = low.toCharArray();
        Arrays.sort(arr);

        answer = new String(arr);

        return answer;
    }


    public static void main(String[] args) {
        String a = "Bcad";
        String solution = solution(a);
        System.out.println("result : " + solution);
    }
}
