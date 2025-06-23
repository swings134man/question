package src.programmers.solve;

/************
 * @info : 프로그래머스 - 점찍기 Lv2
 * @name : 점찍기
 * @date : 2022/12/13 5:44 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 *
 * 1. x축 방향의 최대 거리는 a * k
 * 2. y축 방향의 최대 거리는 b * k
 * 3. 원점과의 거리가 d 를 넘으면 점을 찍지 않는다.
 *
 * - 2중 for문 사용시 time error
 * - 원의 방정식 사용해야함 - x^2 + y^2 <= d^2
 * - ! 하나의 점이 있으면 그것을 기준으로 나머지 한점도 찾을 수 있다. (for문 1번 사용.)
 *
 * - x는 피타고라스 법칙으로 y의 최대값을 구함.
 * - y를 k로 나누면 좌표가 나옴. (0포함해야함으로 +1)
 *
 * -- math.sqrt = 제곱근 구하기
 * -- math.pow = 거듭 제곱 구하기 (d, 2) = d의 2제곱 구함.
 ************/
public class 점찍기 {

    //1
    private static long solution(int k, int d) {
        long answer =  0L;

        for (int i = 0; i <= d / k; i++) {
            long x = i * k;
            long y = (long)Math.sqrt((long) Math.pow(d, 2) - (long) Math.pow(x, 2)) / k; // 원의 방정식 사용.
            answer += y+1; // 0도 포함해줘야 하기때문에 +1
        }//for
        return answer;
    }

    //2
    private static long sol2(int k, int d) {
        long answer = 0;

        for (int i = 0; i < (long)d; i += (long)k) {
            answer += (long) Math.sqrt(d*d - i*i) /k +1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int k = 2;
        int d = 4;

        System.out.println(solution(k,d));
    }
}
