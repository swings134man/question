package src.day02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Q1 {

	public static void main(String[] args) {

		//로또 문제 랜덤 45개 중 6개 출력
		
		Random r = new Random();
		//중복검사를 위한 Hashset
		HashSet<Integer> set = new HashSet<Integer>();

			while (set.size() < 6) {
				int number = r.nextInt(45) + 1;
				set.add(number);
			} //while 
			System.out.println("번호는 : " + set);
			System.out.println("추첨 개수는 : " + set.size());
			
		
		
		
	} //main

} //class
