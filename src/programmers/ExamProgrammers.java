package programmers;

public class ExamProgrammers {

	public static void main(String[] args) {

	} //main

}//class

class Solution_Exam {
	
	public int[] solution(int[] answers) {
		int[] answer = {};
		
		int[] score = new int[3];
		
		int[] per1 = {1,2,3,4,5};
		int[] per2 = {2,1,2,3,2,4,2,5};
		int[] per3 = {3,3,1,1,2,2,4,4,5,5};
		int answer1=0; int answer2=0; int answer3=0;
		
		// score[]에 수포자별 맞힌 갯수
        for(int i=0; i<answers.length; i++){
            if(answers[i] == per1[i%5])  score[0]++; 
            if(answers[i] == per2[i%8])  score[1]++;
            if(answers[i] == per3[i%10]) score[2]++;
        }
		
        //가장 높은점수를 받은 사람
        int max = 0;
        for(int i =0; i < 3; i++) {
        	if(score[i] > max) {
        		max = score[i];
        	}
        }
        
        // 가장 높은 점수를 받은 사람 수
        int maxCount = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max){ maxCount++; } 
        }

        answer = new int[maxCount];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) answer[idx++] = i+1;
        }
        
		
		
		return answer;
	}
	
}
