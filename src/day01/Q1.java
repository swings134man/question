package day01;

import java.util.Scanner;

public class Q1 {
	// aabbbcc를 입력 받으면 알파벳이 각각 몇글자인지 체크하는 프로그램을 완성. 
	
	public static int countS(String x, char ch ) {
		int count = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ch) {
				count++;
			}//if
		}//for
		return count;
	} // staitc

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하세요 > ");
		String input = sc.next();
		
		//출력 부분 
		System.out.println("a의 개수 : " + countS(input, 'a')); //a
		System.out.println("b의 개수 : " + countS(input, 'b')); //b
		System.out.println("c의 개수 : " + countS(input, 'c')); //c
	} //main
}//class
