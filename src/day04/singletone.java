package day04;

public class singletone {

	static singletone object;
	static int count;
	
	private singletone() {
		System.out.println("싱글톤 객체 생성됨.");
		count++;
	}
	
	public static singletone getInstance() {
		if (object == null) {
			object = new singletone();
		} else {
			System.out.println("이미 객체가 생성됨");
		}
		return object;
	} // getinstance
	
	
}// class
