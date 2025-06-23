package src.baekCoding.before_basic;

import java.util.Scanner;

public class 프로그래머스숫자_문자 {

	public static int re(String x) {
		String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		for (int i = 0; i < number.length; i++) {
			x = x.replaceAll(number[i], String.valueOf(i));
		}
		int x1 = Integer.parseInt(x);
		return x1;
	}
	
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int result = re(a);
		System.out.println(result);
		
		
		
	}//main
} //class
