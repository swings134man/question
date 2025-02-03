package baekCoding.category.strings;

import java.util.Scanner;

/**
 * @package : baekCoding.category.strings
 * @name : 열개끊어서_11721.java
 * @date : 2025. 2. 3. 오후 10:16
 * @author : lucaskang(swings134man)
 * @Description: B3 - 문자열
**/
public class 열개끊어서_11721 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));

            if(i % 10 == 9) { // 개행: 0-9, 10-19, 20-29 10글자씩 출력후 개행
                System.out.println();
            }
        } 
    }
}
