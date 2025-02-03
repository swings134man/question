package baekCoding.category.strings;

import java.util.Scanner;

/**
 * @package : baekCoding.category.strings
 * @name : 세로읽기_10798.java
 * @date : 2025. 2. 3. 오후 9:54
 * @author : lucaskang(swings134man)
 * @Description: B1 - 문자열
 * - 최대 5줄, 1줄당 15글자 [5][15]
**/
public class 세로읽기_10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];


        for (int i = 0; i < arr.length; i++) {
            String temp = sc.next();

            // 문자 넣기
            for (int j = 0; j < temp.length(); j++) {
                arr[i][j] = temp.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j][i] != '\u0000') {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }//main
}
