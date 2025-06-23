package src.programmers.solve;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 * <pre>
 * </pre>
 * 
 * @Class : kakao 신고 결과 받기 (프로그래머스)
 * @File : ReportUser.java
 * @Package : programmers
 * @author : seokjunkang
 * @Date : 2022. 7. 6. 오전 1:05:43
 */
public class ReportUser {

	public static void main(String[] args) {
		Solution_Report so = new Solution_Report();

	}// main
} // class

class Solution_Report {
	public int[] solution(String[] id_list, String[] report, int k) {
		// @param idList : 이용자의 ID를 담은 배열.
		// @param report : 신고한 이용자와 신고당한 이용자의 정보를 담은 배열. ex) "a b",.. -> a가 b를 신고
		// @param k : 신고 횟수에 따른 정지 기준 정수값.
		// @return answer : id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 배열.
		/**
		 * 1명당 1명 신고 가능. 여러번 가능하나 1번으로 침.
		 */
		int[] answer = new int[id_list.length];
		Map<String, HashSet<String>> map = new HashMap();
		Map<String, Integer> idxMap = new HashMap();

		// map 초기화
		for (int i = 0; i < id_list.length; i++) {
			String name = id_list[i];
			map.put(name, new HashSet<String>());
			idxMap.put(name, i);
		}

		// 신고 기록
		for (String s : report) {

			String[] str = s.split(" ");
			String from = str[0]; // 신고자 id
			String to = str[1]; // 신고한 id

			map.get(to).add(from); // 신고한 id에 대해 누가 신고했는지 id 저장.
		}

		// 이용정지 메일 발송
		for (int i = 0; i < id_list.length; i++) {
			HashSet<String> send = map.get(id_list[i]);

			if (send.size() >= k) {
				for (String name : send) {
					answer[idxMap.get(name)]++;
				}
			}
		}
		return answer;
	}
}