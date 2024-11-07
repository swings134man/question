package programmers.stack_queue;

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
        Queue<Integer> queue = new LinkedList();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            // 당일
             if(((100 - progresses[i]) & speeds[i]) == 0){
                 queue.offer((100 - progresses[i]) / speeds[i]);
             }else {
                 queue.offer((100 - progresses[i]) / speeds[i] + 1);
             }
        }

        // 첫 배포
        int now = queue.poll();
        int count = 1;

        while (!queue.isEmpty()) {
            if(now >= queue.peek()){
                count ++;
                queue.poll();
            }else {
                list.add(count);
                count = 1;
                now = queue.poll();
            }
        }
        list.add(count);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
