package src.day02;

public class Q3 {

	public static void main(String[] args) {

		//구구단 3단에서 4의 배수 찍지 말아라.
		
		for (int i = 1; i < 10; i++) {
			int x = 3;
			int y = i * x;
			
			if (y % 4 == 0) {
				System.out.println("4의 배수!!! : " + y);
			}else {
				System.out.println(i + "번 "+ y);
			}
			
		}//for 
		
		
	} //main
} //class
