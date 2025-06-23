package src.programmers.stack_queue;

import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        기능개발 r = new 기능개발();
        int[] p = new int[]{93, 30, 55};
        int[] s = new int[]{1, 30, 5};

        int[] solution = r.solution(p, s);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>(); // 배포에 필요한 일수
        List<Integer> list = new ArrayList<>();
        
        // Queue 에 몇일 걸리는지 적재
        for (int i = 0; i < progresses.length; i++) {
            // 100 % 완료라면?
            if((100 - progresses[i]) / speeds[i] == 0) {
                queue.offer((100 - progresses[i]) / speeds[i]);
            }else {
                queue.offer((100 - progresses[i]) / speeds[i] + 1); // 0이 아니면 1일이 더 걸림
            }
        }
        
        int now = queue.poll();
        int count = 1;
        // 비교 시작
        while (!queue.isEmpty()){
            if(now >= queue.peek()) { // 다음 요소가, 첫번쨰 배포일과 같거나 작다면? 같이배포가능
                count++;
            }else {
                list.add(count); // 몇일
                count = 1; //초기화
                now = queue.poll(); // 다음 배포일자?
            }
        }
        list.add(count);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
