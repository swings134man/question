package src.day04;

public class main_main {

	public static void main(String[] args) {
		
		//프로토타입
		proto p1 = new proto();
		proto p2 = new proto();
		System.out.println(p1);
		System.out.println(p2);
		//싱글 톤
		singletone s1 = singletone.getInstance();
		singletone s2 = singletone.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.count);
		System.out.println(s2.count);
		
		
		
		
	} //main
}//class
