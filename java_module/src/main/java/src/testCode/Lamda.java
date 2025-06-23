package src.testCode;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : JAVA Lambda 사용 예제 
 * @File    : Lamda.java
 * @Package : testCode
 * @author  : seokjunkang
 * @Date    : 2022. 7. 26. 오후 11:05:02
 */
public class Lamda {

	/*
	 * 1. JAVA에서 Lambda를 사용하기 위해서는 조건이 있다.
	 * 2. 구현해야할 인터페이스와, 추상 메소드가 단1개만 있어야한다는 조건이다.
	 * 
	 */
	
	@FunctionalInterface
	public interface MyNumber{
		
		int getMax(int n1, int n2);
	}
	
	// Lambda가 사용될 인터페이스에는 @FucntionalInterface 어노테이션을 붙여줌
	// 해당 인터페이스 내부에는 메소드가 1개만 정의되어야 함. 
	
	@FunctionalInterface
	public interface styo{
		public void dosome();
	}
	
	public static void main(String[] args) {

		MyNumber max = (x,y)->(x>=y) ? x:y;
		//					   조건문  ? true : false
		System.out.println(max.getMax(10, 30));
		//----------------------------------------------------
		
		// 정의한 인터페이스 타입 변수명 = () -> 동작로직
		// 변수명.인터페이스 메소드.
		styo s = () -> System.out.println("Lambda");
		s.dosome();
		//----------------------------------------------------
		
//		String name = "asd";
//		int i = 0;
//		(name, i) -> System.out.println(name + "="+i);
		
		
		
	} //main

}//class
