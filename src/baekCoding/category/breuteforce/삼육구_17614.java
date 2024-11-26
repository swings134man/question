package baekCoding.category.breuteforce;

import java.util.Scanner;

// 서브태스크: 100점
public class 삼육구_17614 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int count = 0;
        for (int i = 0; i <= n; i++) {
            String s = String.valueOf(i);

            for (char c: s.toCharArray()){
                if(c == '3' || c == '6' || c == '9'){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
