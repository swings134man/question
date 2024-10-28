package baekCoding.before;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * <pre>
 * </pre>
 * @Class   : 수찾기 
 * @File    : FindNumber.java
 * @Package : baekCoding
 * @author  : seokjunkang
 * @Date    : 2022. 7. 20. 오후 5:13:28
 */
public class FindNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 이분탐색 하기위해서 정렬이 필요함.
		Arrays.sort(arr);
		
		int m = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			
			// 찾고자 하는 값이 있는경우 1, 없으면 0 
			if(binarySearch(arr, sc.nextInt()) >= 0) {
				sb.append(1).append("\n");
			}else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}//main

	
	public static int binarySearch(int[] arr, int key) {
		
		int left = 0;
		int right = arr.length -1;
		
		// left가 right 보다 커지기 전까지 반복.
		while(left <= right) {
			
			int mid = (left + right) / 2; // 중간위치
			
			// key 값이 중간 값보다 작을경우
			if(key < arr[mid]) {
				right = mid - 1;
				
				
			} else if(key > arr[mid]) { // Key 값이 중간값보다 클경우
				left = mid + 1;
				
				
			} else { 	//key 값이 중간위치랑 같을경우
				
				return mid;
			}
		}
		
		// 찾는 값이 없는 경우
		return -1;
	}
	
}
