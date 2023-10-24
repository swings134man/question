package programmers.solve;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 프로그래머스 카카오 오픈채팅 1번 풀이 
 * @File    : OpenChat.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 6. 7. 오후 6:16:23
 */
public class OpenChat {

	public static void main(String[] args) {

		String[] input = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

		String[] out = solution(input);

		for (String resu : out) {
			System.out.println(resu);
		}
		
		
	}//main

	public static String[] solution(String[] record) {
		   
		   HashMap<String, String> id = new HashMap<String, String>(); // UID, NickName
		   
		   // uid, nick name 저장 로
		   for (int i = 0; i < record.length; i++) {
			
			   String[] record_split = record[i].split(" ");
			   
			   if(record_split[0].charAt(0) == 'E' || record_split[0].charAt(0) == 'C') {
				   id.put(record_split[1], record_split[2]); // uid / nickname, 이미 존재시 덮어씌기 처리.
			   }
		   }//for
		   
		   
		   ArrayList<String> arr = new ArrayList<>();
		   
		   for (int i = 0; i < record.length; i++) {
			
			   String[] record_split = record[i].split(" ");
			   char inType = record_split[0].charAt(0); // E, C, L
			   
			   if(inType == 'E') {
				   arr.add(id.get(record_split[1]) + "님이 들어왔습니다.");
				   
			   }else if(inType == 'L') {
				   arr.add(id.get(record_split[1]) + "님이 나갔습니다.");
				   
			   }
			   
		   }//for
		   
		   String[] answer = new String[arr.size()];
		   
		   for (int i = 0; i < arr.size(); i++) {
			   answer[i] = arr.get(i);
			   
		   }
		   
		   
		   return answer;
	       
	}//solution
	
	
	
	
}//class
