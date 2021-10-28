package meetingJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	public static void main(String[] args) {

//		--------- 리스트, 링크드 리스트--------------------------------------------------
//		List<Integer> i = new LinkedList<>();
//		i.add(1);
//		i.add(2);
//		i.add(3);
//		i.add(4);
//		System.out.println(i);
//		i.remove(2); //3이 없어져야함
//		System.out.println(i);
//		i.remove(2); //4가 없어져야함.
//		System.out.println(i);
//		i.add(0, 6); // 0번인덱스에 6 추가
//		System.out.println(i);
//		i.add(7); // 추가로 7 추가, 마지막은 7이 나와야함
//		System.out.println(i);
//		
//		System.out.println("@@@@@@@@@@@@@@@@@@@@");
//		// ---------- 어레이 리스트--------------------------------------------------  
//		ArrayList<Integer> i2 = new ArrayList<Integer>();
//		i2.add(1);
//		i2.add(2);
//		i2.add(3);
//		i2.add(4);
//		System.out.println(i2);
//		i2.remove(2); //3이 없어져야함
//		System.out.println(i2);
//		i2.remove(2); //4가 없어져야함.
//		System.out.println(i2);
//		i2.add(0, 6); // 0번인덱스에 6 추가
//		System.out.println(i2);
//		i2.add(7); // 추가로 7 추가, 마지막은 7이 나와야함
//		System.out.println(i2);
		
		// set
//		Set<Integer> s = new HashSet<Integer>();
//		s.add(1);
//		s.add(1); //중복값 삭제.
//		s.add(2);
//		s.add(3);
//		s.add(4);
//		System.out.println(s);
//		// 해쉬셋의 출력(데이터 전부 출력 및 함수 지정)
//		Iterator<Integer> s2 = s.iterator();
//		int first = s2.next();
//		System.out.println(first);
//		int sec = s2.next();
//		System.out.println(sec);
//		int thr = s2.next();
//		System.out.println(thr);
//		// 전체 출력 ?
//		while (s2.hasNext()) {
//			System.out.println(s2.next());
//		}
		
		// ---------- map--------------------------------------------------
//		HashMap<Integer, String> m = new HashMap<Integer, String>();
//		m.put(1, "1번");
//		m.put(2, "2번");
//		m.put(3, "3번");
//		m.put(1, "4번");
//		System.out.println(m);
		
		
		// ---------- equals() , ==--------------------------------------------------
//		주소 , 값 비교
		test t = new test();
		test2 t2 = new test2();
		
		String a = t.test();
		String b = t2.test2();
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(t.equals(t2));
		
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
		
//		String a = "a";
//		String b = a;
//		String c = new String("a");
//		System.out.println(a.equals(c));
	
			
		
		
		
		
		
		
		
		
		
	}// main
}
