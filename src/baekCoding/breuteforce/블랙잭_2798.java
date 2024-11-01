package baekCoding.breuteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 블랙잭_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        String[] valueString = br.readLine().split(" ");

        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(valueString[i]);
        }

        int result = find(value, n, m);
        System.out.println(result);
    }

    static int find (int[] value, int n, int m) {
        int result = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n-1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = value[i] + value[j] + value[k];

                    if(m == sum) {
                        return sum;
                    }

                    if(result < sum && sum < m){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}