package src.baekCoding.before_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Test13 {

	public static int[] solution(int[] numbers) {
        
        ArrayList<Integer> arr = new ArrayList<>(); // 배열의 값들을 넣어줄 어레이.
        int result = 0; //더한값 넣어줄 int 변수.
        
        for (int i = 0; i < numbers.length; i++) { // 배열의 앞인덱스값.
			
        	for (int j = i + 1; j < numbers.length; j++) { // 배열의 뒤인덱스값.
				result = numbers[i] + numbers[j]; 		   // 인덱스값 두개더해서 int 변수에 넣기.
				
				if (!arr.contains(result)) {			// 어레이리스트에 더한값이 없을때. 
					arr.add(result);					// 어레이리스트에 추가.
				}//if
				
			}//for
		}//for
        
        int[] answer = new int[arr.size()];			// 리턴할 배열.
        
        for (int i = 0; i < arr.size(); i++) {		// for문으로 배열에 차례대로 어레이값 추가.
        	answer[i] = arr.get(i);
		}
        
        Arrays.sort(answer);						// 정렬.
        
        
        
        return answer;
    }
	
	

	public static void main(String[] args) {
		
		
		
		int[] ex = {5,0,2,4};
		int[] re3 = solution(ex);
		
		
		System.out.println(Arrays.toString(re3));
			
	}//main

}
