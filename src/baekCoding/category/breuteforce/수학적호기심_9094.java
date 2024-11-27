package baekCoding.category.breuteforce;

import java.util.Scanner;

//0 < a < b < n인 정수 쌍 (a, b) 중에서 (a2+b2+m)/(ab)가 정수인 쌍의 개수
public class 수학적호기심_9094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int count = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();

            for (int j = 1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if(((j * j) + (k * k) + m) % (j * k) == 0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
