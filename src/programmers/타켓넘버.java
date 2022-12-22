package programmers;

/************
 * @info : 프로그래머스 - 타켓 넘버(lv2) - dfs
 * @name : 타켓넘버
 * @date : 2022/12/22 8:34 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * 1. numbers = 숫자가 담긴 배열
 * 2. target = 숫자들로 만들어야 하는 수
 * 3. return = 방법의 수 (몇개의 방법이 나오는지?)
 *
 ************/
public class 타켓넘버 {

    static int count =0;

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(0, numbers, target, 0);
        answer= count;

        return answer;
    }

    // dfs
    public static void dfs(int index, int[] numbers, int target, int sum) {
        // 배열의 길이 +1 에서 종료.
        if(index == numbers.length) {
            if(sum == target) {
                count++;
            }
            return;
        }
        dfs(index+1, numbers, target, sum+numbers[index]); // +
        dfs(index+1, numbers, target, sum-numbers[index]); // -

    }

    public static void main(String[] args) {

       int[] numbers = {1,1,1,1,1};
       int target = 3;

        int solution = solution(numbers, target);
        System.out.println(solution);

    }
}
