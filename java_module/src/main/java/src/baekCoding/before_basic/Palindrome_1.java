package src.baekCoding.before_basic;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 백준- 팰린드롬인지 확인하기. 
 * @File    : Palindrome_1.java
 * @Package : baekCoding
 * @author  : seokjunkang
 * @Date    : 2022. 11. 25. 오후 3:40:26
 */
public class Palindrome_1 {

	public static int solution(String param) {
		StringBuilder sb = new StringBuilder();
		sb.append(param);
		String reverseString = sb.reverse().toString();
		
		int result = 0;
		if(param.equals(reverseString)) {
			result = 1;
		}else {
			result = 0;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) throws IOException{
		
		// String 문자열 받기
		String ex_1 = "baekjoon";
		String ex_2 = "level";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 -->> ");
		String sc_string = sc.next(); // String 문자열 
		
		int result = solution(sc_string);
		System.out.println("결과는 : "+result);

	} //main

}//class
