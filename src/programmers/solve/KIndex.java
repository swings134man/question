package programmers.solve;

import java.util.Arrays;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : K번째 수 (프로그래머)
 * @File    : KIndex.java
 * @Package : programmers
 * @author  : seokjunkang
 * @Date    : 2022. 7. 6. 오후 8:51:45
 */
public class KIndex {

	public static void main(String[] args) {

		Solution_K k = new Solution_K();
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] result = new int[commands.length];
		
		result = k.solution(array, commands);
		
		System.out.println(Arrays.toString(result));
		
	}//main
}//class

/*
 * 주어진 array 내에서
 * 
 * 1. commands 배열의 0index ~ 1index 까지 자름. 
 * 2. commands 배열의 3index의 숫자에 따라 array 에 어떤 숫자인지 확인.
 * 
 * 배열 자르기
 * sort (정렬)
 * 배열에 저장.
 */
class Solution_K {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			int[] arr = Arrays.copyOfRange(array, commands[i][0] -1, commands[i][1]); //배열복사
        	Arrays.sort(arr);
        	
        	answer[i] = arr[commands[i][2] -1];
		}
        
        
        return answer;
    }
}
