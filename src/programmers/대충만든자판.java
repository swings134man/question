package programmers;

import java.util.Arrays;
import java.util.HashMap;

/************
 * @info : 프로그래머스 - 대충만든자판(LV1)
 * @name : 대충만든자판
 * @date : 2023/03/03 1:14 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 대충만든자판 {


    private int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) { // target 배열 만큼
            int res = 0; // 합계

            for (int j = 0; j < targets[i].length(); j++) { //
                int press = press(keymap, targets[i].charAt(j));// targets의 i번째, j번째 char
                if(press == -1) {
                    res = -1;
                    break;
                }
                res += press; // -1이 아닌경우 res에 클릭횟수 +=
            }
            answer[i] = res;
        }

        return answer;
    }
        // press -> 몇번 눌러야 하는지 체크.
        private int press(String[] keymap, char c) {
            int click = -1;

            for (int i = 0; i < keymap.length; i++) { //keymap
                for (int j = 0; j < keymap[i].length(); j++) { // keymap의 배열
                    if(keymap[i].charAt(j) == c){
                        if(click == -1) { // c를 처음 찾았다면. -> click이 초기화 상태라면.
                            click = j+1;
                        }else if(click > j) { // j가 click보다 작다면 -> 더 적은횟수로 글자를 만들 수 있다면
                            click = j+1;
                        }
                        break;
                    }
                }
            }
            return click;
        }

    // 처음 풀이 -
    private int[] solution2(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>(); // char값(A-Z), 클릭횟수(Integer)

        // keymap - map에 바인딩 하는 작업, 각 char 마다 작은 숫자로 setting
        for (String key: keymap) {
            for (int i = 0; i < key.length(); i++) {

                char ch = key.charAt(i); // keymap의 각 character

                if(map.containsKey(ch)) { // map에 해당 character 가 존재하면
                    if(map.get(ch) > i) { // character의 클릭 횟수가 i보다 크다면? (더 적은 클릭횟수를 찾아야함.)
                        map.replace(ch, i + 1);
                    }
                }else {
                    map.put(ch, i + 1);
                }
            }
        }//foreach


        // target과 비교
        for (int i = 0; i < targets.length; i++) {
            int num = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                char ch = targets[i].charAt(j);

                if(map.containsKey(ch)) {
                    num += map.get(ch);
                }else {
                    num = -1; // 만약 존재하지 않는다면 해결될수 없으므로 -1
                    break;
                }
            }//forj
            answer[i] = num;
        }//fori


        return answer;
    }


    public static void main(String[] args) {
        대충만든자판 s = new 대충만든자판();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        int[] solution = s.solution(keymap, targets);
        System.out.println(Arrays.toString(solution));
    }
}
