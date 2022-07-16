package programmers;

public class 문자열압축 {

	public static void main(String[] args) {

	}

}

class Solution_String {
	
	public int solution(String s) {
		int answer = s.length();
		
        //i개 단위로 자르며 반복
        for(int i = 1; i <= s.length() / 2; i++) {
            //타겟 문자 패턴 설정
            String target = s.substring(0, i);
            String cur = ""; //현재 문자열
            int cnt = 1; //압축 카운트
            StringBuilder sb = new StringBuilder();
            
            for(int start = i; start <= s.length(); start += i) {
                //비교할 현재 문자열
                //다음 자를 문자열의 길이가 단위보다 작으면 남은 글자를 저장
                if(start + i >= s.length()) {
                    cur = s.substring(start, s.length());
                }
                else {
                    cur = s.substring(start, start + i);
                }
            
                //문자열이 같으면 압축카운트 증가
                if(cur.equals(target)) {
                    cnt++;
                }
                //다르면 압축된 문자열을 추가하고 타겟 패턴 변경
                else if(cnt == 1){
                    sb.append(target);
                    target = cur;
                }
                else {
                    sb.append(cnt).append(target);
                    target = cur;
                    cnt = 1;
                }
            }
            //자르고 마지막에 남는 문자열 추가
            if(i != target.length()) sb.append(target);
        
            answer = Math.min(answer, sb.toString().length());
        }
    
        return answer;
    }
	
}
