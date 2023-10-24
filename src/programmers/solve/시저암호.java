package programmers.solve;

/************
 * @info : 프로그래머스 시저암호
 * @name : 시저암호
 * @date : 2023/03/04 2:52 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 시저암호 {

    /**
     * 처음 풀었던 방식.
     * @param s
     * @param n
     * @return
     */
    private String solution(String s, int n) {
        String result = "";
        n = n % 26;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }

    private String solution2(String s, int n) {
        StringBuilder sb = new StringBuilder();

        // 1. 공백은 공백으로 append
        // 2. 소문자는 소문자, 대문자는 대문자
        // 3. n의 수만큼 뒤로
        // 아스키 코드 - a(97), A(65) - z(122), Z(90) - 공백(32)

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c == 32) {
                sb.append(" ");
            }else {
                if(c <= 90) { // Z
                    c += n;
                    if(c > 90) {
                        c -= 26;
                    }
                }else {
                    c += n;
                    if(c > 122) { // z
                        c -= 26;
                    }
                }
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        시저암호 so = new 시저암호();
        String s = "a B z";
        int n = 4;

        String solution = so.solution2(s, n);
        System.out.println(solution);
    }
}
