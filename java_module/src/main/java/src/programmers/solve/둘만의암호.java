package src.programmers.solve;

/************
 * @info : 프로그래머스 - 둘만의암호
 * @name : 둘만의암호
 * @date : 2023/03/04 2:28 AM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 ************/
public class 둘만의암호 {
    /**
     * 1번 솔루션
     * @param s
     * @param skip
     * @param index
     * @return String
     */
    private String solution(String s, String skip, int index) {
        String answer = "";

        // z를 넘었을 때는 알파벳 수만큼 - = 26
        for (int i = 0; i < s.length(); i++) { //5
            char c = s.charAt(i);
            int count = 1;

            while(count <= index) { // index만큼 알파벳 뒤로 미루기
                ++c;
                if(c > 'z') { // 넘었을 경우
                    c -= 26;
                }
                    if(skip.contains(c + "")) {
                        continue;
                    }else {
                        count++;
                    }
            }
            answer += c;
        }
        return answer;
    }

    /**
     * 2번 솔루션
     * @param s
     * @param skip
     * @param index
     * @return String
     */
    private String solution2 (String s, String skip, int index) {
        String answer = "";




        return answer;
    }

    public static void main(String[] args) {
        둘만의암호 so = new 둘만의암호();
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;

        String solution = so.solution2(s, skip, index);

        System.out.println("sol = " + solution);
    }
}
