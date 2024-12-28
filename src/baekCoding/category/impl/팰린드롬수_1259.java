package baekCoding.category.impl;

import java.util.Scanner;

/**
 * @package : baekCoding.category.impl
 * @name : 팰린드롬수_1259.java
 * @date : 2024. 12. 29. 오전 12:36
 * @author : lucaskang(swings134man)
 * @Description: B1 - 구현
**/
public class 팰린드롬수_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int number = sc.nextInt();

            if(number == 0) break;

            String str = String.valueOf(number);
            String reverse = new StringBuilder(str).reverse().toString();

            if(str.equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }//while
    }
}
