package baekCoding.category.breuteforce;

import java.util.Scanner;

public class 신기한수_17618 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int target = i;

            while (target != 0){
                sum += target % 10;
                target /= 10;
            }

            if(i % sum == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
