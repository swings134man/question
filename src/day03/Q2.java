package day03;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
	// Q2 어떤 수를 입력받아 팩토리얼을 구현한 메소드를 작성하시오.
	// 배열 {3, 12 ,45 ,32 ,54, 22}의 합계, 평균, 최댓값, 최솟값 구하기
	
	//더하기
	static int plus(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			int x = list.get(i).intValue();
			sum += x;
		}//for
		return sum;
	}//plus
	
	//평균
	static int avg(ArrayList<Integer> list) {
		int avg = 0;
		for (int i = 0; i < list.size(); i++) {
			 int x = list.get(i).intValue();
			 avg += x;
		}//for
		int avgResult = avg / list.size();
		return avgResult;
	}//avg
	
	//최대값 
	static int max(ArrayList<Integer> list) {
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			 int x = list.get(i).intValue();
			//최대값 비교
			 if (x > max) {
				max = x;
			 }//if
		}//for
		return max;
	}//max
	
	//최소값
	static int min(ArrayList<Integer> list) {
		// 0번 index 부터 비교
		int min = list.get(0).intValue();
		for (int i = 0; i < list.size(); i++) {
			 int x = list.get(i).intValue();
			//최소값 비교
			 if (min > x) {
				min = x;
			 }//if
		}//for
		return min;
	}// min
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// 입력 스캐너
		Scanner sc = new Scanner(System.in);
		
			for (int i = 0; i < 6; i++) {
				System.out.print("숫자 입력(6번 입력해주세요)" + (i+1) + "번 : >> " );
				int num = sc.nextInt();
				list.add(num);
			}//for
			// 입력값 전체 리스트
			System.out.println(list);
			
			//더하기
			System.out.println("더한값은 : " + plus(list));
			//평균
			System.out.println("평균값은 : " + avg(list));
			//최대값 
			System.out.println("최대값은 : " + max(list));
			//최소값 
			System.out.println("최소값은 : " +  min(list));
	}//main
}//class
