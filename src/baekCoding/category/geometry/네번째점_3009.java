package baekCoding.category.geometry;

import java.util.Scanner;

public class 네번째점_3009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // x, y 각각 비교해서 없는거 하나를 찾아서 변수에 넣기
        System.out.println(find(x) + " " + find(y));
    }

    public static int find(int[] arr) {
        int res = 0;
        if(arr[0] == arr[1]){
            res = arr[2];
        }else {
            res = arr[0] == arr[2] ? arr[1] : arr[0];
        }

        return res;
    }
}
