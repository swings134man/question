package programmers.bruteforce;

/**
 * 각 이중배열의 제일 긴, 짧은 길이를 구한다.
 * 긴길이: 모든 원소중 제일 긴 길이
 * 짧길이: 각 이중배열의 원소중 짧은것중 가장 큰것을 고르면 된다.
 *
 */
public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]); // 긴 부분
            int h = Math.min(sizes[i][0], sizes[i][1]); // 짧은 부분

            x = Math.max(x, w);
            y = Math.max(y, h);
        }

        return x*y;
    }
}
