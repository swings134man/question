package src.programmers.solve;

/************
 * @info : 프로그래머스 - 옹알이2
 * @name : 옹알이2
 * @date : 2023/04/05 6:02 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : aya, ye, wpp, ma
 *
 * 주어진 배열에서 조합할수있는 단어의 갯수
 *
 ************/
public class 옹알이2 {

    public int solution(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")) {
                continue;
            }

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if(babbling[i].length()  == 0) answer++;

        }

        return answer;
    }


    public static void main(String[] args) {
        옹알이2 on = new 옹알이2();
        String[] babbling = {"aya", "yee", "u", "maa"};
        System.out.println("on = " + on.solution(babbling));
    }
}
