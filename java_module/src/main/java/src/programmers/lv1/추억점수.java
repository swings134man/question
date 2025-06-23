package src.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/************
 * @info :
 * @name : 추억점수
 * @date : 2023/07/05 9:11 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : 프로그래머스 LV1
 ************/
public class 추억점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            list.add(sum);
        }

        answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        추억점수 a = new 추억점수();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] solution = a.solution(name, yearning, photo);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
