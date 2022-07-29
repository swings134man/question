package testCode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lambda_1 {
	

	public static void main(String[] args) {

		// Ex1
//		Object obj = (a, b) -> a > b ? a : b; // 람다식, 익명 객체 
		
		// 원래의 익명 객체생성 방식.
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a:b;
			}
		};
		
//		int value = obj.max(3,5); // 함수형 인터페이스 
		
		
		// ------------------------------------------------------------------------------\
		// Ex2 
		
//		MyFunction f = new MyFunction() {
//			public int max (int a, int b) { // 오버라이딩 - 접근제어자는 좁게 못바꿈.
//				return a > b ? a :b ;
//			}
//		};
		
		// 람다식을(익명 객체) 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		// 위의 자바 형식 익명객체를 한줄로 변환 가능.
		MyFunction f = (a, b) -> a > b ? a : b;
		
		int value = f.max(2, 5);
		System.out.println("value = " + value);
		
		
		// ------------------------------------------------------------------------------
		// Ex 3
		
		// 익명 객체를 람다식으로 대체
		List<String> list = Arrays.asList("abc","aaa","bbb","ddd","aaa");
		Collections.sort(list, (s1, s2) -> s2.compareTo(s1)); // 인터페이스에 정의된 method를 사용.
		
		// 위의 람다식 원형.
//		Collections.sort(list, new Comparator<String>() {
//			public int compare(String s1, String s2) {
//				return s2.compareTo(s1);
//			}
//		});
		
		// ------------------------------------------------------------------------------
		// Ex 4
		
		// 1번 예제 - 람다식으로 Myfunction2 의 run()을 구현
		Myfunction2 f1 = () -> System.out.println("f1.run()");
		
		// 2번 예제 - 함수형 인터페이스를 일반적인 Java 로 구현
		Myfunction2 f2 = new Myfunction2() { // 익명클래스로 run()을 구현함
			
			@Override
			public void run() { // public 을 반드시 붙여야함. -> 메서드 재정의
				System.out.println("f2.run()");
			}
		};
		
		// 3번 예제
		Myfunction2 f3 = getMyfunction();
		// Myfunction2 f3 = () -> System.out.println("f3.run()"); // static 메서드를 정의하지 않고 하는방법.
		
		f1.run();
		f2.run();
		f3.run();

		execute( () -> System.out.println("execute.run()")); // execute 메서드의 람다식을 매게변수로 받아서 호출하는것. syso를 매개변수로 줌.
		execute( () -> System.out.println("run()") ); // 람다식에 직접 넘겨줌.
	}// main
	
	//Ex4 메서드
	static void execute(Myfunction2 fe) { // 매게변수의 타입이 Myfinction2인 메서드
		fe.run();
	}
	
	static Myfunction2 getMyfunction() {
//		Myfunction2 fget = () -> System.out.println("f3.run()");
//		return fget;
		return () -> System.out.println("f3.run()");
	}
	

} //class

// 함수형 인터페이스, 메서드는 1개만 작성해야함. 2개부터는 오류
// Ex2
@FunctionalInterface
interface MyFunction {
	 int max (int a, int b); 
}

//Ex3
@FunctionalInterface
interface Comparator<T> {
	int compare(T o1, T o2);
}

// Ex4
@FunctionalInterface
interface Myfunction2 {
	void run(); // public abstract void run();
}
