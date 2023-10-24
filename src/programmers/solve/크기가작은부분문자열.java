package programmers.solve;

/************
 * @info : 프로그래머스 - 크기가 작은 부분 문자열 Lv1
 * @name : 크기가작은부분문자열
 * @date : 2023/01/10 1:47 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 크기가작은부분문자열 {

    public static int solution(String t, String p) {
        int answer = 0;

        int pLength = p.length();// p의 길이
        Long num = Long.parseLong(p); // p 롱타입

        // for 길이는 t의 길이 - p의 길이 + 1
        // -> p의 길이가 3일때 -> t를 3개씩 쪼갠다고 했을때. -> 3개로 못자르면 필요가 없기 때문에
        // -> 해당 공식이 사용됨.
        for (int i = 0; i < t.length() - pLength +1; i++) {
            long diff = Long.parseLong(t.substring(i, i + pLength));
            if(diff <= num) answer++;

        }
        return answer;
    }

    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        //result = 2
        int solution = solution(t, p);
        System.out.println(solution);


    }
}
