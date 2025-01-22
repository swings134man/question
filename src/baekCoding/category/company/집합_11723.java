package baekCoding.category.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @package : baekCoding.category.company
 * @name : 집합_11723.java
 * @date : 2025. 1. 22. 오후 5:15
 * @author : lucaskang(swings134man)
 * @Description: 구현(비트마스킹) - S5
 *
 * 비트 연산자
 * | : OR 연산자
 * & : AND 연산자
 * ^ : XOR 연산자 (같으면 0, 다르면 1)
 * ~ : NOT 연산자 (비트 반전)
 * << : 왼쪽 시프트 연산자
 * >> : 오른쪽 시프트 연산자
 *
**/
public class 집합_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int S = 0;
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(str.equals("all")) S = (1 << 21) - 1;
            else if(str.equals("empty")) S = 0;
            else {
                int num = Integer.parseInt(st.nextToken());
                if(str.equals("add"))
                    S |= (1 << num); // number 위치의 비트 추가
                else if(str.equals("remove"))
                    S &= ~(1 << num); // number 위치의 비트 제거
                else if(str.equals("check"))
                    sb.append((S & (1 << num)) != 0 ? 1 : 0).append("\n"); // number 위치의 비트가 있으면 1, 없으면 0
                else if(str.equals("toggle"))
                    S ^= (1 << num); // number 위치의 비트가 있으면 제거, 없으면 추가
            }
        }
        System.out.println(sb);
    }//main
}
