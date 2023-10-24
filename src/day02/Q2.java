package day02;

public class Q2 {

	public static void main(String[] args) {

		// 구구단 출력 1~9단 이중 for 
		
		// 1번 정렬
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + "단 ");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + " X "+ j +" = " + (i * j));
//			}
//		} //1번 for
//		System.out.println();
//		
//		
//		//2번 2차원 배열
//		for (int i = 1; i <= 9; i++) {
//			System.out.print(i + "단" + "\t");
//		} // 제목단
//		System.out.println();
//		System.out.println("-----------------------------------------------------------------------------------");
//		int sum[][] = new int[10][10];
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				sum[i][j] = i * j;
//				System.out.print(sum[i][j] + "\t");
//		}
//			System.out.println();
//		}//1 
		
		
		//3 번 표형태 
		
		int num = 1; 
		System.out.print("\t"+ "");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "\t");
		} // 제목
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "|" + "\t");
			for (int j = 1; j <= 9; j++) {
				
				System.out.print((i * j) + "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	} //main
} //class
