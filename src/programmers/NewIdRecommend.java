package programmers;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 (신규 아이디 추천) 
 * @File    : NewIdRecommend.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 7. 5. 오후 7:11:25
 */
public class NewIdRecommend {

	public static void main(String[] args) {
		
		String new_id = ".ne@#!%?}wew#$$&..^";
//		String new_id = "ss";
		
		String result = solution(new_id);
		
		System.out.println(result);
		
	}

	// solution 
	public static String solution(String new_id) {
		
		String answer = "";		// return String
		String result = new_id; // 각 단계별 결과를 담을 변수.
		
		String pattern_dot = "[.]{2,}"; // 마침표 연속 문자 제
		
		// 1. 소문자 치환
		result = result.toLowerCase();
		
		// 2. 소문자, 숫자, -, _, . 제외 문자 제거 
		char[] chList = result.toCharArray(); // char Array
		StringBuilder sbc = new StringBuilder();
		
		for (char c : chList) {
			if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
				sbc.append(c);
			}
		}
		result = sbc.toString();
		
		
		
		// 3. 마침표(.) 두번 연속 부분 -> 1개로 수정
		result = result.replaceAll(pattern_dot, ".");
		
		// 4. 마침표가 처음, 끝 부분 위치하면제거 
		String step4 = result; 
		
		// 첫번째 마침표 제거
		if(step4.length() > 0) {
			if(step4.charAt(0) == '.') {
				step4 = step4.substring(1, step4.length());
			}
		}
		
		// 마지막 마침표 제거.
		if(step4.length() > 0) {
			if(step4.charAt(step4.length() -1) == '.') {
				step4 = step4.substring(0, step4.length() - 1);
			}
			
		}
		result = step4;
		
		// 5. new_id 가 빈 문자열이라면 a 대입. 
		if(result.equals("")) {
			result = "a";
		}

		// 6. 16자 이상, 첫 15개 제외 제거
		if(result.length() > 15) {
			result = result.substring(0, 15);
			
			// 6-2 마지막 word가 마침표 일때.
			if(result.charAt(result.length() -1) == '.') {
				result = result.substring(0, result.length() -1);
			}
		} // if end
		
		
		// 7. 변수의 길이가 2자 이하라면 변수의 마지막 문자를 길이가 3이 될때 까지 반복해서 끝에 붙이기.
		StringBuilder sb = new StringBuilder(result);
		
		if(sb.length() <= 2) {
			char lastWord = sb.charAt(sb.length() -1);
			
			while (sb.length() < 3) {
				sb.append(lastWord);
			}
		}
		
		result = sb.toString();
		
		
		answer = result; 
		return answer;
	}
}

/** 
 * 
 * <pre>
 * </pre>
 * @Class   : 고도화 풀이. 
 * @File    : NewIdRecommend.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 7. 6. 오전 12:12:29
 */
class Solution {
	public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        if(temp.length()<=2)
            while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);

        answer=temp;
        return answer;
    }
}
