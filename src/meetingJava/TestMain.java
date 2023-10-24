package meetingJava;

public class TestMain {

	public static void main(String[] args) {

		test t1 = new test();
		
		t1.test1();
		
		for (int i = 0; i < t1.test1().size(); i++) {
			System.out.println(t1.test1().get(i));
		}
		
	} //main
}//class
