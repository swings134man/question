package src.programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;

/************
 * @info : 프로그래머스 - 달리기경주
 * @name : 달리기경주
 * @date : 2023/08/10 9:40 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : players:선수, callings:호출
 ************/
public class 달리기경주 {

    // 1. 9 ~ 13 : time out
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};

        for (int i = 0; i < callings.length; i++) {
            String target = callings[i];
            
            //1. 순위에서 찾기
            for (int j = 0; j < players.length; j++) {
                if(players[j].equals(target)){
                    players[j] = players[j -1];
                    players[j -1] = target;
                    break;
                }
            }
        }//for

        answer = players;

        return answer;
    }

    public String[] solution2(String[] players, String[] callings) {
        HashMap map = new HashMap();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String target: callings){
            int index = (int) map.get(target);

            // 1. map
            map.put(players[index], index - 1);
            map.put(players[index - 1], index);

            // 2. players
            players[index] = players[index -1];
            players[index -1] = target;
        }

        return players;
    }

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        달리기경주 so = new 달리기경주();
        String[] solution = so.solution2(players, callings);
        System.out.println("solution = " + Arrays.toString(solution));
        // 9 ~ 13
    }
}
