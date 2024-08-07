package programmers.lv1;

// 최소 횟수 구하기
public class 덧칠하기 {


    private static int solution(int n, int m, int[] section) {
        int answer = 0;

        int size = section.length;
        int next = section[0]; // 다음에 칠할 구간
        int idx = 0; // 현재 위치

        while (idx < size) {
            if(next <= section[idx]) {
                next = section[idx] + m;
                answer++;
            }
            idx ++;
        }

        return answer;
    }



    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        int[] section = {1, 2, 3, 4};

        int solution = solution(n, m, section);

        System.out.println(solution);
    }
}
