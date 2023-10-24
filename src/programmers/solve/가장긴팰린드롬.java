package programmers.solve;

/************
 * @info : 프로그래머스 - 가장 긴 팰린드롬(Lv3)
 * @name : 가장긴팰린드롬
 * @date : 2023/02/25 6:21 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 가장긴팰린드롬 {

    /*
        처음 풀었던 방식
     */
    private int solution(String s) {
        int answer = 0;

        for(int i=s.length(); i>0; i--) {
            for(int j=0; j+i <= s.length(); j++) {
                if(isPalin(j, j+i-1, s)) {
                    return i;
                }
            }
        }
        return answer;
    }
    // solution 관련 Method
    public boolean isPalin(int strt, int end, String s) {
        while(strt <= end) {
            if(s.charAt(strt++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        가장긴팰린드롬 so = new 가장긴팰린드롬();
        int res = so.solution("abcdcba");
        System.out.println("res : " + res);
    }
}
