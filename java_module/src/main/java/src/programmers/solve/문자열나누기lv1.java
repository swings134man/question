package src.programmers.solve;

/************
 * @info : 프로그래머스 - 문자열나누기 lv1
 * @name : 문자열나누기lv1
 * @date : 2023/02/03 2:23 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 문자열나누기lv1 {

    private int solution(String s) {
        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                result++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return result;
    }

}
