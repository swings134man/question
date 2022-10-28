package programmers;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 잘라서 배열로 만들기 .Programmers  
 * @File    : StringToArray.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 10. 28. 오후 10:33:53
 */
public class StringToArray {

	public static void main(String[] args) {

		String my_str = "abc1Addfggg4556b";
		int n = 6;
		
		String[] res = solution_subString(my_str, n);
		System.out.println(Arrays.toString(res));
	}

	
	public static String[] solution_subString(String my_str, int n) {
		 String[] answer = {};
	        int answer_length = my_str.length() / n;
	        if(my_str.length() % n != 0){
	            answer_length++;
	        }
	        answer = new String[answer_length];
	        for(int i = 0; i < answer.length; i++){
	            if(!(i == answer.length -1)){
	                answer[i] = my_str.substring(n * i, n * (i+1));
	            }
	            else answer[i] = my_str.substring(n * i);
	        }
	        return answer;
    }//main
}
