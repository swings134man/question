package programmers.solve;

import java.util.Arrays;

public class 잘라서배열저장 {
	
	public static String[] solution(String my_str, int n) {
		String answer[] = {};
		int answer_length = my_str.length() / n; // 나누기.
		
		if(my_str.length() % n != 0) {
			answer_length++;
		}
		
		answer = new String[answer_length]; // 길이 할당
		for(int i=0; i<answer.length; i++) {
			if(!(i == answer_length-1)) {
				answer[i] = my_str.substring(n * i, n * (i+1));
			}else {
				answer[i] = my_str.substring(n * i);
			}
		}
		return answer;
	}
	

	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		System.out.println(Arrays.toString(solution(my_str, n)));
	}

}
