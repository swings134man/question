package programmers;

import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 과일장수 - 사과박 
 * @File    : 과일장수.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 12. 6. 오전 12:56:52
 * 
 * 최대의 이익을 내야함. 
 * 
 * 최저 사과 점수 * 한상자 사과갯수 * 상자갯수 
 * 
 * 풀이 
 * - 상자 하나에 담긴 사과중 제일 낮은 점수의 사과 *  한상자당 갯수 = 최대이익
 * -- > 한상자당 그나마 제일 낮은순서대로 모아야 최대이익이 발생
 */
public class 과일장수 {
	
	private static int solution(int k, int m, int[] score) {
		int answer = 0;
		
		// 정렬
		Integer[] arrInteger = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(arrInteger, Collections.reverseOrder());
		
		// 사과 상자 만큼 반복.
		for (int i=0; i<score.length; i++) {
			if((i + 1) % m == 0) {
				answer += arrInteger[i] * m;
			}
		}
		
		
		return answer;
	} //sol

	// 2번째 방법
	private static int solution2 (int k, int m, int[] score) {
		int answer = 0;
		
		Arrays.sort(score); //[1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4]
		
		// m(한상자 사과 갯수) 만큼 줄여나감.
		for(int i = score.length; i>=m; i -= m) {
			answer += score[i - m] * m;
			System.out.println(score[i - m]);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		int k = 4;	//사과의 최대 품질
		int m = 3;  // 한박스에 담을 수 있는 갯수
		int[] score = {4,1,2,2,4,4,4,4,1,2,4,2}; // 사과들의 점수 
		
		int result = solution2(k, m, score);
		System.out.println("res : " + result);
	}//main
}//class
