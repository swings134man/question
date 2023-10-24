package testCode;

import java.util.Arrays;

public class Java2차원 {

    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

        // 2차원 배열 선언.
        int[][] array2 = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        // 1번 출력 - 직접 접근
        System.out.println(Arrays.toString(array2[1]));

        // 2번 출력 - 반복문 & Arrays.toString
        for(int i=0; i<array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }

        // 3번 출력 - 반복문 (요소 하나하나 출력)
        for(int i=0; i<array2.length; i++) {
            for(int j=0; j<array2[i].length; j++){
                System.out.println(array2[i][j]);
            }
        }

        // 4번 출력 - deepToString(전체 출력)
        System.out.println(Arrays.deepToString(array2));

    }
}
