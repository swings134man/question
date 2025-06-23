package src.baekCoding.category.breuteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Brute Force 한번더
// n 개의 카드갯수 를 더해서 m 에 최대한 근접한 수 구하기.(m 을 넘으면 안됨)
public class 블랙잭_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] valueString = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        br.close();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(valueString[i]);
        }

        System.out.println(findNumber(arr, n, m));
    }

    private static int findNumber(int[] arr, int n, int m) {
        int result = 0;

        // 완전 탐색
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if(sum == m) {
                        result = sum;
                    }

                    if(sum <= m && result < sum) {
                        result = sum;
                    }
                }
            }
        }

        return result;
    }
}