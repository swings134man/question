package baekCoding.category.arrays;

import java.util.Scanner;

public class 평균_1546 {
    // first Solve
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] grade = new int[n];
//        for (int i = 0; i < grade.length; i++) {
//            grade[i] = sc.nextInt();
//        }
//        sc.close();
//
//        // max
//        int max = grade[0];
//        for (int i = 0; i < grade.length; i++) {
//            if(max < grade[i]){
//                max = grade[i];
//            }
//        }
//
//        // Calc
//        double[] fix = new double[grade.length];
//        for (int i = 0; i < fix.length; i++) {
//            fix[i] = (double) grade[i] / max * 100;
//        }
//
//        double sum = 0;
//        for(double in : fix) {
//            sum += in;
//        }
//        System.out.println(sum / n);
//    }

    // Refactor
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] grade = new int[n];
        for (int i = 0; i < grade.length; i++) {
            grade[i] = sc.nextInt();
        }
        sc.close();

        int max = findMax(grade);
        double[] doubles = calcFix(grade, max);
        System.out.println(calcAvg(doubles));
    }

    public static int findMax(int[] n){
        int x = n[0];
        for (int i = 0; i < n.length; i++) {
            if(x < n[i]){
                x = n[i];
            }
        }
        return x;
    }

    public static double[] calcFix(int[] n, int max) {
        double[] res = new double[n.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = (double) n[i] / max * 100;
        }
        return res;
    }

    public static double calcAvg(double[] input) {
        double n = 0;
        for(double db: input){
            n += db;
        }

        return n / input.length;
    }
}
