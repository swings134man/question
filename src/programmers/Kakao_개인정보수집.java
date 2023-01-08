package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/************
 * @info : 프로그래머스 - 카카오 - 개인정보 수집 유효기간 Lv1
 * @name : Kakao_개인정보수집
 * @date : 2023/01/08 4:37 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * - 파기해야할 개인정보의 번호를 오름차순(asc) 정렬 및 배열 return
 *
 ************/
public class Kakao_개인정보수집 {

    public static int[] solution(String today, String[] terms, String[] privacies) {
//        int[] answer = {};

        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();
        int date = getDate(today); // 일자로 환산.

        // terms
        for(String s : terms){
            String[] terms1 = s.split(" ");
            // 0 : A
            // 1 : 12
            termMap.put(terms1[0], Integer.parseInt(terms1[1])); // A 12
        }

        // privacies & 비교
        // "2019.01.01 D"
        for (int i = 0; i < privacies.length; i++) {
            String[] pr = privacies[i].split(" "); // 0: 2019.01.01, 1: D

            // 비교
            if(getDate(pr[0]) + (termMap.get(pr[1]) * 28) <= date) {
                answer.add(i + 1);
            }
        }    

        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    private static int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }

    public static void main(String[] args) {
//        String da = "2021.12.28";
//        String te = "A 6"; // B 12, C 3
//        System.out.println(getDate(da));

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        int[] solution = solution(today, terms, privacies);
        System.out.println(Arrays.toString(solution));
    }


}
