package programmers;


/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 - 문자열나누기 level0 
 * @File    : 문자열나누기_level0.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 12. 5. 오후 6:40:59
 */
public class 문자열나누기_level0 {
	
	public static int solution(String s) {
		int result = 0;
		
		char one = ' ';
		int same = 0;
		int diff = 0;
		
		
		for(int i=0; i<s.length(); i++) {
			// 1-1
			if(one == ' ') {
				one = s.charAt(i);
			}
			
			// 1-2
			if(one == s.charAt(i)) {
				same++;
			}else {
				diff++;
			}
			
			// 1-3
			if(same == diff) {
				result++;
				one = ' ';
				same = 0;
				diff = 0;
			}
		}
		
		// 2-1
		if(same != 0) {
			result++;
		}
		
		// 3-1
		//return 
		if(result == 0) {
			result = 1;
		}
		
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		String a = "banana";
		int result = solution(a);
		
		System.out.println(solution(a));
		
	} //main
}//class
