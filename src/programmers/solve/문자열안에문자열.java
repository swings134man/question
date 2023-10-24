package programmers.solve;

/************
 * @info : 문자열안에 문자열 - 프러그래머스 lv0
 * @name : 문자열안에문자열
 * @date : 2023/02/03 2:01 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description : str1 내부에 str2 가 있으면 1 리턴, 없으면 2 리턴
 ************/
public class 문자열안에문자열 {

    public int solution(String str1, String str2) {
        // refactoring 전
//        int answer = 0;
//        if(str1.contains(str2)) {
//            answer = 1;
//        }else {
//            answer = 2;
//        }
//        return answer;

        // Refactoring
        return (str1.contains(str2) ? 1 : 2);
    }

    public static void main(String[] args) {

    }
}
