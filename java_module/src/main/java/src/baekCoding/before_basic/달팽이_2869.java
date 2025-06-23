package src.baekCoding.before_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이_2869 {
    public static void main(String[] args) throws IOException {
        // A B V
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        br.close();

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int v = Integer.parseInt(s[2]);

        int perDay = a - b; // 하루에 갈 수 있는거리
        int dis = v - b; // 최종 거리

        /**
         * 최종 목적지 / 하루에 움직이는거리(a-b)
         * 밤에 미끄러지는 거리를 생각 = v-b -> 낮동안에 올라갔다면 -b 를 할 이유가 없다. 그러므로 v-b 만큼 올라가면 된다.
         * 최종 거리 % 하루움직이는거리 == 0 나누어떨어진다면 -> 목적지/하루 = 로 해결이 가능하고
         * 그게 아니라면? +1 일을 추가해주면 올라갈 수 있는것.
         */
        if(dis % perDay == 0){
            System.out.println(dis / perDay);
        }else {
            System.out.println(dis / perDay + 1);
        }
    }
}
