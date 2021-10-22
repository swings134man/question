package day03;

public class Q3 {

	public static void main(String[] args) {

		// Q3 1~100 숫자 중 3의 배수만 더해서 출력 하는 코드
		
		int result = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				result += i;
			}
		}//for

		System.out.println("3의 배수만을 더한 값 : " + result);
	} //main
}//class
