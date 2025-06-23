package src.baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 벌집_2292.java
 * @date : 2025. 1. 22. 오후 5:08
 * @author : lucaskang(swings134man)
 * @Description: 1부터 타겟 n 까지의 몇개 지나가는지, 시작과 끝도 포함
 * range 가 1씩 증가할수록 갯수는 6개씩 증가
 * range + (count * 6) == n
**/
public class 벌집_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n == 1) {
            System.out.println(1);
        }else {
            // n != 1
            int count = 1;
            int range = 2; // 범위는 2부터 시작
            while (range <= n){
                range = range + (count * 6);
                count++; // 1씩 증가
            }
            System.out.println(count);
        }
    }
}
