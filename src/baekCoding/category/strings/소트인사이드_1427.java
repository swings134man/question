package baekCoding.category.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @package : baekCoding.category.strings
 * @name : 소트인사이드_1427.java
 * @date : 2025. 2. 3. 오후 6:08
 * @author : lucaskang(swings134man)
 * @Description: S5 - 문자열
 * 정렬하려는 수 N 이 주어짐.
 * n 의 각 자릿수를 내림차순 정렬
**/
public class 소트인사이드_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] num = sc.next().split("");
        Arrays.stream(num)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);
    }
}
