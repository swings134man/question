package src.programmers.solve;

import java.util.Arrays;

/************
 * @info : 프로그래머스 - 배열 회전 시키기(lv0)
 * @name : 배열회전시키기
 * @date : 2023/02/02 5:26 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * - direction = left면 numbers[] 의 원소를 왼쪽으로 한칸씩 민다, right도 동일, 
 ************/
public class 배열회전시키기 {

    private int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("left")) { //left
            for (int i = 0; i < numbers.length -1; i++) {
                answer[i] = numbers[i + 1];
            }
            answer[numbers.length - 1] = numbers[0];
        } else { //right
            for (int i = 0; i < numbers.length -1; i++) {
                answer[i + 1] = numbers[i];
            }
            answer[0] = numbers[numbers.length -1];
        }

        return answer;
    }

    public static void main(String[] args) {
        String direction = "right";
        int[] numbers = {1,2,3};

        배열회전시키기 arr = new 배열회전시키기();
        int[] solution = arr.solution(numbers, direction);
        System.out.println(Arrays.toString(solution));
    }

}
