package src.baekCoding.before_basic;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 평균은_4344 {
//    public static void main(String[] args) throws IOException{
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//
//        int[] arr;
//
//        for(int i=0; i < c; i++){
//            int stCount = sc.nextInt();
//
//            arr = new int[stCount];
//            double sum = 0;
//
//            // point in
//            for (int j=0; j < stCount; j++){
//                int stPoint = sc.nextInt();
//                arr[j] = stPoint;
//                sum += stPoint;
//            }
//
//            double avg = sum/stCount;
//            double count = 0;
//
//            for (int j=0; j<stCount; j++){
//                if(arr[j] > avg){
//                    count++;
//                }
//            }
//
//            System.out.printf("%.3f%%\n", (count/stCount) * 100);
//        }
//        sc.close();
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        int[] arr;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int n = Integer.parseInt(st.nextToken());//총인원
            arr = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                int point = Integer.parseInt(st.nextToken());
                arr[j] = point;
                sum += point;
            }

            float avg = sum/n;
            float sumCount = 0;

            for (int j = 0; j < n; j++) {
                if(arr[j] > avg) {
                    sumCount++;
                }
            }
            System.out.printf("%.3f%%", (sumCount/n) * 100);
        }
        br.close();
    }
}
