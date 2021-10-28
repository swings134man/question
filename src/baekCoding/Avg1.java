package baekCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Avg1 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
////		
//		double k = sc.nextInt();
//		double e = sc.nextInt();
//		double m = sc.nextInt();
////		
//		double result = (k + e + m) / 3;
//		String avg = String.format("%.2f", result);
//		double avg2 = Double.parseDouble(avg);
////		
//		if(avg2 >= 90){
//			System.out.println(avg + " A");
//		}else if(90 > avg2 && avg2 >= 80){
//			System.out.println(avg + " B");
//		}else if(80 > avg2 && avg2 >= 70){
//			System.out.println(avg + " C");
//		}else if(70 > avg2 && avg2 >= 60) {
//			System.out.println(avg + " D");
//		}else {
//			System.out.println(avg + " c");
//		}
//		sc.close();
		
		
		List<Integer> i = new LinkedList<>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		System.out.println(i);
		i.remove(2); //3이 없어져야함
		System.out.println(i);
		i.remove(2); //4가 없어져야함.
		System.out.println(i);
		i.add(0, 6); // 0번인덱스에 6 추가
		System.out.println(i);
		i.add(7); // 추가로 7 추가, 마지막은 7이 나와야함
		System.out.println(i);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		
		ArrayList<Integer> i2 = new ArrayList<Integer>();
		i2.add(1);
		i2.add(2);
		i2.add(3);
		i2.add(4);
		System.out.println(i2);
		i2.remove(2); //3이 없어져야함
		System.out.println(i2);
		i2.remove(2); //4가 없어져야함.
		System.out.println(i2);
		i2.add(0, 6); // 0번인덱스에 6 추가
		System.out.println(i2);
		i2.add(7); // 추가로 7 추가, 마지막은 7이 나와야함
		System.out.println(i2);
		
		
		
		
		
		
		
		
	}//main
}
