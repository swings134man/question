package src.programmers.solve;

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
 * 문제 해석 
 * 1. 사과의 등급 : 1~k
 * 2. 한상자에 m 개씩 들어감
 * 3. 상자 가격 = 상자안의 최저 점수사과 * m
 * 4. 사과는 상자 단위 판매 -> 남는 사과는 버림
 * 5. 구해야 하는 것? -> 최대 이익
 *
 * 최대 이익을얻기 위해서 -> 사과 등급이 높은것 부터 포장.
 * --> 높은것끼리 묶을수록 가격 UP 
 * ---> 즉 높은 가격의 상자부터 팔아야 함. 
 * ---> (점수가 낮은 즉 가격이 낮은) 상자는 굳이 안팔아도 되기 때문에 나머지를 버려도 이익
 * 
 * 풀이 
 * - 상자 하나에 담긴 사과중 제일 낮은 점수의 사과 *  한상자당 갯수 = 최대이익
 * --> 2번쨰 방법이 효율적.
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
