package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int count = 0;

        for(int i = 0; i < n; i++) {
           int target = Integer.parseInt(st.nextToken());

           for(int j=2; j <= target; j++){
                if(j == target) {
                    count++;
                }
                if(target % j == 0){
                    break;
                }
           }
        }
        System.out.println(count);
    }
}