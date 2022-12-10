package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/************
 * @info : 프로그래머스 - 명예의 전당 Lv1
 * @name : 명예의전당
 * @date : 2022/12/07 11:46 PM
 * @author : SeokJun Kang(swings134@gmail.com)
 * @version : 1.0.0
 * @Description :
 *
 * 1. 매일 한명의 가수가 노래를 부르고 점수를 받는다.
 * 2. 명예의 전당에는 k 만큼 리스트업 된다.
 * 3. k 이후 부터는 k 번째 가수보다 점수가 높다면 -> k번째 가수는 리스트 삭제. 그리고 점수 순서로 list
 * 4. 매일 최하위 점수를 발표한다. -> 배열로 발표점수를 return.(해답.)
 *
 ************/
public class 명예의전당 {

    private static int[] solution(int k , int[] score) {
        ArrayList<Integer> rank = new ArrayList<>();
        ArrayList<Integer> minPoint = new ArrayList<>();

        // 전당의 모든 요소 비교
        for (int i = 0; i < score.length; i++) {
            // k 일까지는 랭킹에 등록
            if(i < k) {
                rank.add(score[i]);     // 랭킹 등록
                Collections.sort(rank); // 랭킹 정렬
                minPoint.add(rank.get(0)); // 결과에 낮은 점수 추가.

            } else {
                // 최저 점수와 i일차의 점수가 같으면
                if(rank.get(0) == score[i]) {
                    minPoint.add(rank.get(0));
                }

                // 최저 점수 보다 i 일차의 점수가 높다면
                if (rank.get(0) < score[i]) {
                    rank.set(0, score[i]); //최저 점수 delete 및 저장
                    Collections.sort(rank); // 전당 랭킹 list up
                    minPoint.add(rank.get(0));
                }

                // 최저 점수가 점수 보다 높으면
                if(rank.get(0) > score[i]){
                    minPoint.add(rank.get(0));
                }
            }
        }//for
        return minPoint.stream().mapToInt(i -> i).toArray();
    } //sol1

    // 리팩토링.
    private static int[] refactoring (int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        for (int i = 0; i<score.length; i++) {
            queue.add(score[i]);

            // queue의 수가 k 보다 넘어가면 제일 작은것 부터 제거.
            if(queue.size() > k){
                queue.poll(); // 제일 작은 값을 제거한다.
            }

            // 제일 작은 값을 return 만 진행하고 삭제는 하지 않는다.
            answer[i] = queue.peek();
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] a = {10,100,20,150,1,100,200};
        int k = 3;

//        int[] result = solution(k, a);
//        System.out.println(Arrays.toString(result));

        System.out.println(Arrays.toString(refactoring(k,a)));
    }
}
