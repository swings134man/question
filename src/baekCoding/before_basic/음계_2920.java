package baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 음계_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        boolean ac = true;
        boolean dc = true;

        for (int i = 0; i < 7; i++) {
            if(arr[i] < arr[i + 1]) dc=false; // 다음 숫자가 더 크면 desc 실패
            if(arr[i] > arr[i + 1]) ac=false; // 다음 숫자가 작으면 asc 실패
        }

        if(ac) System.out.println("ascending");
        else if (dc)  System.out.println("descending");
        else System.out.println("mixed");
    }

    public void hardCoding() {
        // ... 하드코딩으로 푸는 사람도 있네,,,
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        sc.close();
        System.out.println(next.equals("1 2 3 4 5 6 7 8") ? "ascending" :
                           next.equals("8 7 6 5 4 3 2 1") ? "descending" : "mixed");
    }
}
