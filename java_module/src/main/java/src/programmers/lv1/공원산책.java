package src.programmers.lv1;


import java.util.Arrays;

/************
 * @info : 공원산책 - 프로그래머스 Lv1
 * @name : 공원산책
 * @date : 11/14/23 8:23 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : N = {1, 0}, S = {0, 1}, E = {1, 0}, W = {0, 1}
 ************/
public class 공원산책 {
    public static int[] solution(String[] park, String[] routes) {
        int sx = 0;
        int sy = 0;

        char[][] arr = new char[park.length][park[0].length()];

        // start index
        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        for (String str : routes) {
            String way = str.split(" ")[0];
            int len = Integer.parseInt(str.split(" ")[1]);

            int nx = sx;
            int ny = sy;

            for (int i = 0; i < len; i++) {
                if (way.equals("E")) {
                    nx++;
                }
                if (way.equals("W")) {
                    nx--;
                }
                if (way.equals("S")) {
                    ny++;
                }
                if (way.equals("N")) {
                    ny--;
                }
                if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
                    if (arr[ny][nx] == 'X') {
                        break;
                    }
                    // 범위내 & 장애물 x
                    if (i == len - 1) {
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }
        return new int[]{sy, sx};
    }

    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        // res = [2, 1]

        int[] solution = solution(park, routes);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
