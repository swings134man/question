package src.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q2_2 {
	// Q2 어떤 수를 입력받아 팩토리얼을 구현한 메소드를 작성하시오.
	// 배열 {3, 12 ,45 ,32 ,54, 22}의 합계, 평균, 최댓값, 최솟값 구하기
	// 배열 버전
	
	//더하기
	static int plus(int[] List) {
		int sum = 0;
		for(int i = 0; i < List.length; i++) {
//			int x = List.get(i).intValue();
			int x = List[i];
			sum += x;
		}//for
		return sum;
	}//plus
	
	//평균
	static int avg(int[] List) {
		int avg = 0;
		for (int i = 0; i < List.length; i++) {
			 int x = List[i];
			 avg += x;
		}//for
		int avgResult = avg / List.length;
		return avgResult;
	}//avg
	
	//최대값 
	static int max(int[] List) {
		int max = 0;
		for (int i = 0; i < List.length; i++) {
			int x = List[i];
			//최대값 비교
			 if (x > max) {
				max = x;
			 }//if
		}//for
		return max;
	}//max
	
	//최소값
	static int min(int[] List) {
		// 0번 index 부터 비교
		int min = List[0];
		for (int i = 0; i < List.length; i++) {
			 int x = List[i];
			//최소값 비교
			 if (min > x) {
				min = x;
			 }//if
		}//for
		return min;
	}// min
	
	public static void main(String[] args) {
		
		
		int[] List = new int[6];
		
		// 입력 스캐너
		Scanner sc = new Scanner(System.in);
		
			for (int i = 0; i < 6; i++) {
				System.out.print("숫자 입력(6번 입력해주세요)" + (i+1) + "번 : >> " );
				int num = sc.nextInt();
				List[i] = num;
			}//for
			// 입력값 전체 리스트
			System.out.println(Arrays.toString(List));
			
			//더하기
			System.out.println("더한값은 : " + plus(List));
			//평균
			System.out.println("평균값은 : " + avg(List));
			//최대값 
			System.out.println("최대값은 : " + max(List));
			//최소값 
			System.out.println("최소값은 : " +  min(List));
	}//main
}//class
