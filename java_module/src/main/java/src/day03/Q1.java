package src.day03;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		// Q1 데이터 입력 감자 입력시 삐삐 출력 양파입력시 엥엥 출력
		Scanner sc = new Scanner(System.in);
		
		// 입력.
		System.out.print("데이터 입력 >>> ");
		String in = sc.nextLine();
		System.out.println();
		
		// 공백 제거 및 배열에 저장
		String[] result = in.split(" ");
		//배열 길이 출력
		System.out.println("배열의 길이 : "+ result.length);
		System.out.println(in);
		
		
		for(int i = 0; i < result.length; i++) {
			if (result[i].equals("감자")) {
				System.out.println("삐삐");
			}else if(result[i].equals("양파")) {
				System.out.println("엥엥");
			} //else if
		} // for
		
		
		
	} //main
}//class
