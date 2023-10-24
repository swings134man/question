package baekCoding;

import java.util.HashSet;

public class phonecatmon_Progreammers {
	
	public static int solution(int[] nums) {
		// 1. 
        int canSelect = nums.length/2; //가져갈 수 있는 폰켓몬의 수.
	// 2. 
        HashSet<Integer> pocket = new HashSet<>(); //중복 제거를 위한 set.
        for(int i=0; i<nums.length; i++){	// 폰켓몬의 수만큼 for문 
           // 3. 
            if(pocket.size()<canSelect){	// 만약 pocket에 담긴 폰켓몬의 수가 canSelect
               // 4.						// 보다 작으면. 
                pocket.add(nums[i]);		// pocket에 해당번호 폰켓몬 add.
            }
        }
        //5.
        return pocket.size();
    }

	public static void main(String[] args) {

		// 폰켓몬의 개수 : n
		// 가져갈 수 있는 폰켓몬 : n/2 즉 절반. 
		// 폰켓몬은 번호로 구분. 같은 종류는 같은 번호로 구분.
		// 같은종류를 가질수 있는 경우는 1개.
		// 다른종류 가질수 있는 경우는 최대 2개.
		// 최대한 많은 폰켓몬 종류폰켓못 + n/2 개 가질것.
		// 폰켓몬의 종류 배열은 nums[]
		// N/2 마리 선택, 가장 많은 종류 폰켓몬 선택 방법 찾기
		// 폰켓몬 종류 번호의 개수 
		// 선택할 수 있는 폰켓몬 종류 개수 최대값 한개만 return 
		
		// 배열안에 숫자가 다른 값들 Count++; 
		// 중복시 Count--;
		int[] nums = {1,1,1,1,2,3};
		int result = solution(nums);
		System.out.println("개수는 : " + result);
		
		
		
		
		
		
	} //main
}//class
