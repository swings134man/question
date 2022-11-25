package programmers;

import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 - 가장 긴 팰린드롬 구하기 
 * @File    : Palindrome.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 11. 25. 오후 4:06:36
 * 
 * -- 문자열 s가 주어질 때 s의 부분문자열중 가장 긴 팰린드롬 길이 return 
 */
public class Palindrome {

	public static boolean solve(int strt, int end, String s) {
		
		// *** StringBuilder reverse() , String subString() 금지.
		
		// 1. 가장 긴 범위 부터 줄여나가는 loop
		// 2. index (시작순서)가 0인것 부터 시작하는 loop
		// 3. 문자열의 시작, 마지막 문자값 구하기 필요.
		while(strt <= end) {
			if(s.charAt(strt++) != s.charAt(end--)) {
				return false;
			}
		}
		return true;
	}
	
	// 팰린드롬 구하기.
	public static int isPalin(String s) {
		
		
		for (int i = s.length(); i > 0; i--) {
			for (int j = 0; j+i <= s.length(); j++) { // strt, end 의 길이만큼 loop
				// 시작, 끝, 문자열.
				if(solve(j, j+i-1, s)) {
					return i;
				} //if
			}//for2
		}//for1
		return 0;
	}
	
	public static void main(String[] args) {
		String s = "";

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 --> ");
		s = sc.next();
		
		int result = isPalin(s);
		System.out.println("결과는 : " + result);
	}//main
}//class
