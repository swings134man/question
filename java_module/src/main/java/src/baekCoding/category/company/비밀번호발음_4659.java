package src.baekCoding.category.company;

import java.util.Scanner;

/**
 * @package : baekCoding.category.company
 * @name : 비밀번호발음_4659.java
 * @date : 2025. 2. 5. 오후 3:22
 * @author : lucaskang(swings134man)
 * @Description: S5 - 문자열
 * - 모음(a,e,i,o,u) 하나이상 반드시 포함
 * - 모음 3개, 자음3개 연속으로 오면 안됨
 * - 같은 글자가 연속 2번 나오면 안됨, ee,oo 는 허용
**/
public class 비밀번호발음_4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        while (!(str = sc.next()).equals("end")){
            boolean notInclude = false; // 모음 포함 여부
            boolean contiWords = false; // 연속 3개 여부
            boolean three = false; // 같은글자 여부 확인
            int contiGCnt = 0; // 이전 모음 연속 여부 갯수
            int contiNCnt = 0; // 이전 자음 연속 여부 갯수

            if(!str.contains("a") && !str.contains("e") && !str.contains("i") && !str.contains("o") && !str.contains("u")) {
                notInclude = true;
            }else {
                for (int i = 0; i < str.length(); i++){
                    char c = str.charAt(i);

                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                        contiGCnt ++;
                        contiNCnt = 0;
                    }else {
                        contiNCnt ++;
                        contiGCnt = 0;
                    }

                    if(contiGCnt > 2 || contiNCnt > 2) {
                        contiWords = true;
                    }

                    if(i < str.length() -1) {
                        char c2 = str.charAt(i + 1);
                        if(c == c2) {
                            if(c != 'e' && c != 'o'){
                                three = true;
                            }
                        }
                    }
                }
            }//else

            if (notInclude || contiWords || three) {
                flagPrint(false, str);
            }else {
                flagPrint(true, str);
            }
        }
    }

    private static void flagPrint(boolean flag, String password) {
        if(!flag) {
            System.out.println("<" + password + ">" + " is not acceptable.");
        }else {
            System.out.println("<" + password + ">" + " is acceptable.");
        }
    }
}
