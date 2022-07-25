package testCode;

public class TestCode {

	public static void main(String[] args) {

		String a= "...!@BaT#*..y.abcdefghijklm";
		
		Solution so = new Solution();
		String result = so.solution(a);
		
		System.out.println(result);
		
		
	}//main

}//class

class Solution {
	public String solution(String new_id) {
		String answer = "";
		String temp = new_id.toLowerCase();
		
		temp = temp.replaceAll("[^-_.a-z0-9]", "");
		temp = temp.replaceAll("[.]{2,}", "."); // []첫번쨰 대괄호 에 해당하는 {2}숫자만큼  -> 리플레이스 .
		temp = temp.replaceAll("^[.]|[.]$", "");
		
		if(temp.equals("")) {
			temp+="a";
		}
		
		if(temp.length() >= 16) {
			temp = temp.substring(0, 15);
			temp = temp.replaceAll("^[.]|[.]$", "");
		}
		
		if(temp.length() <= 2) {
			while (temp.length() < 3) {
				temp += temp.charAt(temp.length() -1);
			}
		}
		
		answer = temp;
		
		return answer;
	}
}